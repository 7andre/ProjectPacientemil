package com.andrealef.w2mongo.api;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

	@Document(collection = "w2")
	public class W2 implements Serializable {
		private static final long SerialVersionUID = 1L;

		@Id
		private String id;
		private int prontuario;
		private String paciente;
		private String sexo;
		private String arma;
		private String patente;
		private String TS;
		private int idade;
		private int leito;
		private Date dt_ent;
		private Date dt_sda;
		private String medico;
		private String tpFerimento;
		private String est_paciente;
		private String diagn_Final;

		public W2() {
		}

		public W2(String id, int prontuario, String paciente, String sexo, String arma, String patente, String TS,
				int idade, int leito, Date dt_ent, Date dt_sda, String medico, String tpFerimento, String est_paciente,
				String diagn_Final) {
			super();
			this.id = id;
			this.prontuario = prontuario;
			this.paciente = paciente;
			this.sexo = sexo;
			this.arma = arma;
			this.patente = patente;
			this.TS = TS;
			this.idade = idade;
			this.leito = leito;
			this.dt_ent = dt_ent;
			this.dt_sda = dt_sda;
			this.medico = medico;
			this.tpFerimento = tpFerimento;
			this.est_paciente = est_paciente;
			this.diagn_Final = diagn_Final;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public int getProntuario() {
			return prontuario;
		}

		public void setProntuario(int prontuario) {
			this.prontuario = prontuario;
		}

		public String getPaciente() {
			return paciente;
		}

		public void setPaciente(String paciente) {
			this.paciente = paciente;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getArma() {
			return arma;
		}

		public void setArma(String arma) {
			this.arma = arma;
		}

		public String getPatente() {
			return patente;
		}

		public void setPatente(String patente) {
			this.patente = patente;
		}

		public String getTS() {
			return TS;
		}

		public void setTS(String TS) {
			this.TS = TS;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public int getLeito() {
			return leito;
		}

		public void setLeito(int leito) {
			this.leito = leito;
		}

		public Date getDt_ent() {
			return dt_ent;
		}

		public void setDt_ent(Date dt_ent) {
			this.dt_ent = dt_ent;
		}

		public Date getDt_sda() {
			return dt_sda;
		}

		public void setDt_sda(Date dt_sda) {
			this.dt_sda = dt_sda;
		}

		public String getMedico() {
			return medico;
		}

		public void setMedico(String medico) {
			this.medico = medico;
		}

		public String getTpFerimento() {
			return tpFerimento;
		}

		public void setTpFerimento(String tpFerimento) {
			this.tpFerimento = tpFerimento;
		}

		public String getEst_paciente() {
			return est_paciente;
		}

		public void setEst_paciente(String est_paciente) {
			this.est_paciente = est_paciente;
		}

		public String getDiagn_Final() {
			return diagn_Final;
		}

		public void setDiagn_Final(String diagn_Final) {
			this.diagn_Final = diagn_Final;
		}
	     
		@Override
		public boolean equals(Object obj) {
			if(this==obj)
				return true;
			
			if(obj==null)
				return false;
			
			if(getClass()!=obj.getClass())
				return false;
			
			W2 other = (W2)obj;
			  if(id==null) {
				  if(other.id!=null)
					  return false;
				  
			  }
			  else if(!id.equals(other.id))
				  return false;
			  return true;
		}
   }
