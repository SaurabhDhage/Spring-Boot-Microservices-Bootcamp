package com.example.springcloudvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponseSupport;

import java.util.Objects;

@SpringBootApplication
public class SpringCloudVaultApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudVaultApplication.class, args);
		SpringCloudVaultApplication springCloudVaultApplication=new SpringCloudVaultApplication();
		VaultEndpoint vaultEndpoint=new VaultEndpoint();
		vaultEndpoint.setScheme("http");
		VaultTemplate vaultTemplate = new VaultTemplate(vaultEndpoint,
				new TokenAuthentication("00000000-0000-0000-0000-000000000000"));
		springCloudVaultApplication.createSecrets(vaultTemplate);
		springCloudVaultApplication.accessSecrets(vaultTemplate);

	}
	public  void createSecrets(VaultTemplate vaultTemplate){
		Credentials credentials = new Credentials("saurabh", "admin");
		vaultTemplate.write("kv/secret/myapp", credentials);
	}

	/**
	 * small note here: while creating secret always select version 1 then only it works else throw exception
	 * command to start vault server: vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"

	 */
    public void accessSecrets(VaultTemplate vaultTemplate){
	VaultResponseSupport<Credentials> response = vaultTemplate.read("kv/secret/myapp", Credentials.class);
	assert response != null;
	Objects.requireNonNull(response.getData()).toStringData();
	}
}
