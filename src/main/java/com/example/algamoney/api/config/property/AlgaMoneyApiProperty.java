package com.example.algamoney.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("algamonay")
public class AlgaMoneyApiProperty {

	private Seguranca seguranca = new Seguranca();
	private String origemPermitida = "http://localhost:8000";
	
	public Seguranca getSeguranca() {
		return seguranca;
	}

	public static class Seguranca{
		
		private boolean enableHttps;
		
		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
		
		public boolean isEnableHttps() {
			return enableHttps;
		}
	}

	public String getOrigemPermitida() {
		return origemPermitida;
	}

	public void setOrigemPermitida(String origemPermitida) {
		this.origemPermitida = origemPermitida;
	}
	
}
