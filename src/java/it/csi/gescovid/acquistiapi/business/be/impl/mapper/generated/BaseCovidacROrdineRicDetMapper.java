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

import it.csi.gescovid.acquistiapi.business.be.impl.mapper.dto.CovidacROrdineRicDet;

public interface BaseCovidacROrdineRicDetMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_ric_det
	 * @mbg.generated
	 */
	@Delete({ "delete from covidac_r_ordine_ric_det", "where ricdet_stato_id = #{ricdetStatoId,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer ricdetStatoId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_ric_det
	 * @mbg.generated
	 */
	@Insert({ "insert into covidac_r_ordine_ric_det (ord_id, ricdet_id, ", "data_creazione, data_modifica, ",
			"data_cancellazione, utente_operazione)",
			"values (#{ordId,jdbcType=INTEGER}, #{ricdetId,jdbcType=INTEGER}, ",
			"#{dataCreazione,jdbcType=TIMESTAMP}, #{dataModifica,jdbcType=TIMESTAMP}, ",
			"#{dataCancellazione,jdbcType=TIMESTAMP}, #{utenteOperazione,jdbcType=VARCHAR})" })
	@Options(useGeneratedKeys = true, keyProperty = "ricdetStatoId")
	int insert(CovidacROrdineRicDet record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_ric_det
	 * @mbg.generated
	 */
	@Select({ "select", "ricdet_stato_id, ord_id, ricdet_id, data_creazione, data_modifica, data_cancellazione, ",
			"utente_operazione", "from covidac_r_ordine_ric_det",
			"where ricdet_stato_id = #{ricdetStatoId,jdbcType=INTEGER}" })
	@Results({ @Result(column = "ricdet_stato_id", property = "ricdetStatoId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ord_id", property = "ordId", jdbcType = JdbcType.INTEGER),
			@Result(column = "ricdet_id", property = "ricdetId", jdbcType = JdbcType.INTEGER),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	CovidacROrdineRicDet selectByPrimaryKey(Integer ricdetStatoId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_ric_det
	 * @mbg.generated
	 */
	@Select({ "select", "ricdet_stato_id, ord_id, ricdet_id, data_creazione, data_modifica, data_cancellazione, ",
			"utente_operazione", "from covidac_r_ordine_ric_det" })
	@Results({ @Result(column = "ricdet_stato_id", property = "ricdetStatoId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ord_id", property = "ordId", jdbcType = JdbcType.INTEGER),
			@Result(column = "ricdet_id", property = "ricdetId", jdbcType = JdbcType.INTEGER),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	List<CovidacROrdineRicDet> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_ordine_ric_det
	 * @mbg.generated
	 */
	@Update({ "update covidac_r_ordine_ric_det", "set ord_id = #{ordId,jdbcType=INTEGER},",
			"ricdet_id = #{ricdetId,jdbcType=INTEGER},", "data_creazione = #{dataCreazione,jdbcType=TIMESTAMP},",
			"data_modifica = #{dataModifica,jdbcType=TIMESTAMP},",
			"data_cancellazione = #{dataCancellazione,jdbcType=TIMESTAMP},",
			"utente_operazione = #{utenteOperazione,jdbcType=VARCHAR}",
			"where ricdet_stato_id = #{ricdetStatoId,jdbcType=INTEGER}" })
	int updateByPrimaryKey(CovidacROrdineRicDet record);
}