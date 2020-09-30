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

import it.csi.gescovid.acquistiapi.business.be.impl.mapper.dto.CovidacDOrdineStato;

public interface BaseCovidacDOrdineStatoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_d_ordine_stato
	 * @mbg.generated
	 */
	@Delete({ "delete from covidac_d_ordine_stato", "where ord_stato_id = #{ordStatoId,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer ordStatoId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_d_ordine_stato
	 * @mbg.generated
	 */
	@Insert({ "insert into covidac_d_ordine_stato (ord_stato_cod, ord_stato_desc, ", "validita_inizio, validita_fine, ",
			"data_creazione, data_modifica, ", "data_cancellazione, utente_operazione)",
			"values (#{ordStatoCod,jdbcType=VARCHAR}, #{ordStatoDesc,jdbcType=VARCHAR}, ",
			"#{validitaInizio,jdbcType=TIMESTAMP}, #{validitaFine,jdbcType=TIMESTAMP}, ",
			"#{dataCreazione,jdbcType=TIMESTAMP}, #{dataModifica,jdbcType=TIMESTAMP}, ",
			"#{dataCancellazione,jdbcType=TIMESTAMP}, #{utenteOperazione,jdbcType=VARCHAR})" })
	@Options(useGeneratedKeys = true, keyProperty = "ordStatoId")
	int insert(CovidacDOrdineStato record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_d_ordine_stato
	 * @mbg.generated
	 */
	@Select({ "select", "ord_stato_id, ord_stato_cod, ord_stato_desc, validita_inizio, validita_fine, ",
			"data_creazione, data_modifica, data_cancellazione, utente_operazione", "from covidac_d_ordine_stato",
			"where ord_stato_id = #{ordStatoId,jdbcType=INTEGER}" })
	@Results({ @Result(column = "ord_stato_id", property = "ordStatoId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ord_stato_cod", property = "ordStatoCod", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ord_stato_desc", property = "ordStatoDesc", jdbcType = JdbcType.VARCHAR),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	CovidacDOrdineStato selectByPrimaryKey(Integer ordStatoId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_d_ordine_stato
	 * @mbg.generated
	 */
	@Select({ "select", "ord_stato_id, ord_stato_cod, ord_stato_desc, validita_inizio, validita_fine, ",
			"data_creazione, data_modifica, data_cancellazione, utente_operazione", "from covidac_d_ordine_stato" })
	@Results({ @Result(column = "ord_stato_id", property = "ordStatoId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ord_stato_cod", property = "ordStatoCod", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ord_stato_desc", property = "ordStatoDesc", jdbcType = JdbcType.VARCHAR),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	List<CovidacDOrdineStato> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_d_ordine_stato
	 * @mbg.generated
	 */
	@Update({ "update covidac_d_ordine_stato", "set ord_stato_cod = #{ordStatoCod,jdbcType=VARCHAR},",
			"ord_stato_desc = #{ordStatoDesc,jdbcType=VARCHAR},",
			"validita_inizio = #{validitaInizio,jdbcType=TIMESTAMP},",
			"validita_fine = #{validitaFine,jdbcType=TIMESTAMP},",
			"data_creazione = #{dataCreazione,jdbcType=TIMESTAMP},",
			"data_modifica = #{dataModifica,jdbcType=TIMESTAMP},",
			"data_cancellazione = #{dataCancellazione,jdbcType=TIMESTAMP},",
			"utente_operazione = #{utenteOperazione,jdbcType=VARCHAR}",
			"where ord_stato_id = #{ordStatoId,jdbcType=INTEGER}" })
	int updateByPrimaryKey(CovidacDOrdineStato record);
}