package it.csi.gescovid.acquistiapi.business.be.impl.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import it.csi.gescovid.acquistiapi.business.be.impl.mapper.dto.CovidacTMagazzino;

public interface BaseCovidacTMagazzinoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_t_magazzino
	 * @mbg.generated
	 */
	@Delete({ "delete from covidac_t_magazzino", "where magaz_id = #{magazId,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer magazId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_t_magazzino
	 * @mbg.generated
	 */
	@Insert({ "insert into covidac_t_magazzino (magaz_nome, magaz_indirizzo, ",
			"magaz_comune_codice, validita_inizio, ", "validita_fine, data_creazione, ",
			"data_modifica, data_cancellazione, ", "utente_operazione)",
			"values (#{magazNome,jdbcType=VARCHAR}, #{magazIndirizzo,jdbcType=VARCHAR}, ",
			"#{magazComuneCodice,jdbcType=VARCHAR}, #{validitaInizio,jdbcType=TIMESTAMP}, ",
			"#{validitaFine,jdbcType=TIMESTAMP}, #{dataCreazione,jdbcType=TIMESTAMP}, ",
			"#{dataModifica,jdbcType=TIMESTAMP}, #{dataCancellazione,jdbcType=TIMESTAMP}, ",
			"#{utenteOperazione,jdbcType=VARCHAR})" })
	@Options(useGeneratedKeys = true, keyProperty = "magazId")
	int insert(CovidacTMagazzino record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_t_magazzino
	 * @mbg.generated
	 */
	@Select({ "select", "magaz_id, magaz_nome, magaz_indirizzo, magaz_comune_codice, validita_inizio, ",
			"validita_fine, data_creazione, data_modifica, data_cancellazione, utente_operazione",
			"from covidac_t_magazzino", "where magaz_id = #{magazId,jdbcType=INTEGER}" })
	@Results({ @Result(column = "magaz_id", property = "magazId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "magaz_nome", property = "magazNome", jdbcType = JdbcType.VARCHAR),
			@Result(column = "magaz_indirizzo", property = "magazIndirizzo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "magaz_comune_codice", property = "magazComuneCodice", jdbcType = JdbcType.VARCHAR),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	CovidacTMagazzino selectByPrimaryKey(Integer magazId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_t_magazzino
	 * @mbg.generated
	 */
	@Select({ "select", "magaz_id, magaz_nome, magaz_indirizzo, magaz_comune_codice, validita_inizio, ",
			"validita_fine, data_creazione, data_modifica, data_cancellazione, utente_operazione",
			"from covidac_t_magazzino" })
	@Results({ @Result(column = "magaz_id", property = "magazId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "magaz_nome", property = "magazNome", jdbcType = JdbcType.VARCHAR),
			@Result(column = "magaz_indirizzo", property = "magazIndirizzo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "magaz_comune_codice", property = "magazComuneCodice", jdbcType = JdbcType.VARCHAR),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	List<CovidacTMagazzino> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_t_magazzino
	 * @mbg.generated
	 */
	@Update({ "update covidac_t_magazzino", "set magaz_nome = #{magazNome,jdbcType=VARCHAR},",
			"magaz_indirizzo = #{magazIndirizzo,jdbcType=VARCHAR},",
			"magaz_comune_codice = #{magazComuneCodice,jdbcType=VARCHAR},",
			"validita_inizio = #{validitaInizio,jdbcType=TIMESTAMP},",
			"validita_fine = #{validitaFine,jdbcType=TIMESTAMP},",
			"data_creazione = #{dataCreazione,jdbcType=TIMESTAMP},",
			"data_modifica = #{dataModifica,jdbcType=TIMESTAMP},",
			"data_cancellazione = #{dataCancellazione,jdbcType=TIMESTAMP},",
			"utente_operazione = #{utenteOperazione,jdbcType=VARCHAR}",
			"where magaz_id = #{magazId,jdbcType=INTEGER}" })
	int updateByPrimaryKey(CovidacTMagazzino record);
}