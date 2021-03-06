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

import it.csi.gescovid.acquistiapi.business.be.impl.mapper.dto.CovidacROrdineStato;

public interface BaseCovidacROrdineStatoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_stato
	 * @mbg.generated
	 */
	@Delete({ "delete from covidac_r_ordine_stato", "where ordrstato_id = #{ordrstatoId,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer ordrstatoId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_stato
	 * @mbg.generated
	 */
	@Insert({ "insert into covidac_r_ordine_stato (ord_id, ord_stato_id, ", "validita_inizio, validita_fine, ",
			"data_creazione, data_modifica, ", "data_cancellazione, utente_operazione, ",
			"data_consegna, quantita_consegnata)",
			"values (#{ordId,jdbcType=INTEGER}, #{ordStatoId,jdbcType=INTEGER}, ",
			"#{validitaInizio,jdbcType=TIMESTAMP}, #{validitaFine,jdbcType=TIMESTAMP}, ",
			"#{dataCreazione,jdbcType=TIMESTAMP}, #{dataModifica,jdbcType=TIMESTAMP}, ",
			"#{dataCancellazione,jdbcType=TIMESTAMP}, #{utenteOperazione,jdbcType=VARCHAR}, ",
			"#{dataConsegna,jdbcType=TIMESTAMP}, #{quantitaConsegnata,jdbcType=INTEGER})" })
	@Options(useGeneratedKeys = true, keyProperty = "ordrstatoId")
	int insert(CovidacROrdineStato record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_stato
	 * @mbg.generated
	 */
	@Select({ "select", "ordrstato_id, ord_id, ord_stato_id, validita_inizio, validita_fine, data_creazione, ",
			"data_modifica, data_cancellazione, utente_operazione, data_consegna, quantita_consegnata",
			"from covidac_r_ordine_stato", "where ordrstato_id = #{ordrstatoId,jdbcType=INTEGER}" })
	@Results({ @Result(column = "ordrstato_id", property = "ordrstatoId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ord_id", property = "ordId", jdbcType = JdbcType.INTEGER),
			@Result(column = "ord_stato_id", property = "ordStatoId", jdbcType = JdbcType.INTEGER),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR),
			@Result(column = "data_consegna", property = "dataConsegna", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "quantita_consegnata", property = "quantitaConsegnata", jdbcType = JdbcType.INTEGER) })
	CovidacROrdineStato selectByPrimaryKey(Integer ordrstatoId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_stato
	 * @mbg.generated
	 */
	@Select({ "select", "ordrstato_id, ord_id, ord_stato_id, validita_inizio, validita_fine, data_creazione, ",
			"data_modifica, data_cancellazione, utente_operazione, data_consegna, quantita_consegnata",
			"from covidac_r_ordine_stato" })
	@Results({ @Result(column = "ordrstato_id", property = "ordrstatoId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ord_id", property = "ordId", jdbcType = JdbcType.INTEGER),
			@Result(column = "ord_stato_id", property = "ordStatoId", jdbcType = JdbcType.INTEGER),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR),
			@Result(column = "data_consegna", property = "dataConsegna", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "quantita_consegnata", property = "quantitaConsegnata", jdbcType = JdbcType.INTEGER) })
	List<CovidacROrdineStato> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_stato
	 * @mbg.generated
	 */
	@Update({ "update covidac_r_ordine_stato", "set ord_id = #{ordId,jdbcType=INTEGER},",
			"ord_stato_id = #{ordStatoId,jdbcType=INTEGER},", "validita_inizio = #{validitaInizio,jdbcType=TIMESTAMP},",
			"validita_fine = #{validitaFine,jdbcType=TIMESTAMP},",
			"data_creazione = #{dataCreazione,jdbcType=TIMESTAMP},",
			"data_modifica = #{dataModifica,jdbcType=TIMESTAMP},",
			"data_cancellazione = #{dataCancellazione,jdbcType=TIMESTAMP},",
			"utente_operazione = #{utenteOperazione,jdbcType=VARCHAR},",
			"data_consegna = #{dataConsegna,jdbcType=TIMESTAMP},",
			"quantita_consegnata = #{quantitaConsegnata,jdbcType=INTEGER}",
			"where ordrstato_id = #{ordrstatoId,jdbcType=INTEGER}" })
	int updateByPrimaryKey(CovidacROrdineStato record);
}