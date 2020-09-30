package it.csi.gescovid.acquistiapi.business.be.impl.mapper.dto;

import java.util.Date;

public class CovidacLogAudit {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column covidac_log_audit.audit_id
	 * @mbg.generated
	 */
	private Integer auditId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column covidac_log_audit.data_ora
	 * @mbg.generated
	 */
	private Date dataOra;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column covidac_log_audit.id_app
	 * @mbg.generated
	 */
	private String idApp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column covidac_log_audit.ip_address
	 * @mbg.generated
	 */
	private String ipAddress;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column covidac_log_audit.utente
	 * @mbg.generated
	 */
	private String utente;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column covidac_log_audit.operazione
	 * @mbg.generated
	 */
	private String operazione;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column covidac_log_audit.ogg_oper
	 * @mbg.generated
	 */
	private String oggOper;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column covidac_log_audit.key_oper
	 * @mbg.generated
	 */
	private String keyOper;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column covidac_log_audit.audit_id
	 * @return  the value of covidac_log_audit.audit_id
	 * @mbg.generated
	 */
	public Integer getAuditId() {
		return auditId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column covidac_log_audit.audit_id
	 * @param auditId  the value for covidac_log_audit.audit_id
	 * @mbg.generated
	 */
	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column covidac_log_audit.data_ora
	 * @return  the value of covidac_log_audit.data_ora
	 * @mbg.generated
	 */
	public Date getDataOra() {
		return dataOra;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column covidac_log_audit.data_ora
	 * @param dataOra  the value for covidac_log_audit.data_ora
	 * @mbg.generated
	 */
	public void setDataOra(Date dataOra) {
		this.dataOra = dataOra;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column covidac_log_audit.id_app
	 * @return  the value of covidac_log_audit.id_app
	 * @mbg.generated
	 */
	public String getIdApp() {
		return idApp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column covidac_log_audit.id_app
	 * @param idApp  the value for covidac_log_audit.id_app
	 * @mbg.generated
	 */
	public void setIdApp(String idApp) {
		this.idApp = idApp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column covidac_log_audit.ip_address
	 * @return  the value of covidac_log_audit.ip_address
	 * @mbg.generated
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column covidac_log_audit.ip_address
	 * @param ipAddress  the value for covidac_log_audit.ip_address
	 * @mbg.generated
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column covidac_log_audit.utente
	 * @return  the value of covidac_log_audit.utente
	 * @mbg.generated
	 */
	public String getUtente() {
		return utente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column covidac_log_audit.utente
	 * @param utente  the value for covidac_log_audit.utente
	 * @mbg.generated
	 */
	public void setUtente(String utente) {
		this.utente = utente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column covidac_log_audit.operazione
	 * @return  the value of covidac_log_audit.operazione
	 * @mbg.generated
	 */
	public String getOperazione() {
		return operazione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column covidac_log_audit.operazione
	 * @param operazione  the value for covidac_log_audit.operazione
	 * @mbg.generated
	 */
	public void setOperazione(String operazione) {
		this.operazione = operazione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column covidac_log_audit.ogg_oper
	 * @return  the value of covidac_log_audit.ogg_oper
	 * @mbg.generated
	 */
	public String getOggOper() {
		return oggOper;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column covidac_log_audit.ogg_oper
	 * @param oggOper  the value for covidac_log_audit.ogg_oper
	 * @mbg.generated
	 */
	public void setOggOper(String oggOper) {
		this.oggOper = oggOper;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column covidac_log_audit.key_oper
	 * @return  the value of covidac_log_audit.key_oper
	 * @mbg.generated
	 */
	public String getKeyOper() {
		return keyOper;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column covidac_log_audit.key_oper
	 * @param keyOper  the value for covidac_log_audit.key_oper
	 * @mbg.generated
	 */
	public void setKeyOper(String keyOper) {
		this.keyOper = keyOper;
	}
}