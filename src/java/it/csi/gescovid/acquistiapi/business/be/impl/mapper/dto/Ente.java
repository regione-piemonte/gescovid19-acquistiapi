package it.csi.gescovid.acquistiapi.business.be.impl.mapper.dto;

public class Ente {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ente.id_ente
	 * @mbg.generated
	 */
	private Integer idEnte;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ente.nome
	 * @mbg.generated
	 */
	private String nome;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ente.tot_posti_target
	 * @mbg.generated
	 */
	private Integer totPostiTarget;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ente.id_ente
	 * @return  the value of ente.id_ente
	 * @mbg.generated
	 */
	public Integer getIdEnte() {
		return idEnte;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ente.id_ente
	 * @param idEnte  the value for ente.id_ente
	 * @mbg.generated
	 */
	public void setIdEnte(Integer idEnte) {
		this.idEnte = idEnte;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ente.nome
	 * @return  the value of ente.nome
	 * @mbg.generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ente.nome
	 * @param nome  the value for ente.nome
	 * @mbg.generated
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ente.tot_posti_target
	 * @return  the value of ente.tot_posti_target
	 * @mbg.generated
	 */
	public Integer getTotPostiTarget() {
		return totPostiTarget;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ente.tot_posti_target
	 * @param totPostiTarget  the value for ente.tot_posti_target
	 * @mbg.generated
	 */
	public void setTotPostiTarget(Integer totPostiTarget) {
		this.totPostiTarget = totPostiTarget;
	}
}