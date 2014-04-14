package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnreceber generated by hbm2java
 */
public class Fnreceber implements java.io.Serializable {

	private FnreceberId id;
	private Sgfilial sgfilial;
	private Fnconta fnconta;
	private Fntipocob fntipocob;
	private Vdcliente vdcliente;
	private Fnplanopag fnplanopag;
	private Fnplanejamento fnplanejamento;
	private Vdvenda vdvenda;
	private Vdvendedor vdvendedor;
	private Fnrenegrec fnrenegrec;
	private Fnbanco fnbanco;
	private Fncc fncc;
	private Fncartcob fncartcob;
	private BigDecimal vlrrec;
	private BigDecimal vlrdescrec;
	private BigDecimal vlrmultarec;
	private BigDecimal vlrjurosrec;
	private BigDecimal vlrdevrec;
	private BigDecimal vlrparcrec;
	private BigDecimal vlrpagorec;
	private BigDecimal vlrapagrec;
	private BigDecimal vlrbasecomis;
	private BigDecimal vlrretensaoiss;
	private Date dtcomprec;
	private Date datarec;
	private String statusrec;
	private BigDecimal vlrcomirec;
	private Date dtquitrec;
	private int docrec;
	private Integer nroparcrec;
	private String obsrec;
	private Character flag;
	private Character altusurec;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnitrecebers = new HashSet(0);

	public Fnreceber() {
	}

	public Fnreceber(FnreceberId id, Sgfilial sgfilial, Vdcliente vdcliente,
			Fnplanopag fnplanopag, BigDecimal vlrrec, BigDecimal vlrdevrec,
			BigDecimal vlrparcrec, Date dtcomprec, Date datarec,
			String statusrec, int docrec, char emmanut, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.fnplanopag = fnplanopag;
		this.vlrrec = vlrrec;
		this.vlrdevrec = vlrdevrec;
		this.vlrparcrec = vlrparcrec;
		this.dtcomprec = dtcomprec;
		this.datarec = datarec;
		this.statusrec = statusrec;
		this.docrec = docrec;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnreceber(FnreceberId id, Sgfilial sgfilial, Fnconta fnconta,
			Fntipocob fntipocob, Vdcliente vdcliente, Fnplanopag fnplanopag,
			Fnplanejamento fnplanejamento, Vdvenda vdvenda,
			Vdvendedor vdvendedor, Fnrenegrec fnrenegrec, Fnbanco fnbanco,
			Fncc fncc, Fncartcob fncartcob, BigDecimal vlrrec,
			BigDecimal vlrdescrec, BigDecimal vlrmultarec,
			BigDecimal vlrjurosrec, BigDecimal vlrdevrec,
			BigDecimal vlrparcrec, BigDecimal vlrpagorec,
			BigDecimal vlrapagrec, BigDecimal vlrbasecomis,
			BigDecimal vlrretensaoiss, Date dtcomprec, Date datarec,
			String statusrec, BigDecimal vlrcomirec, Date dtquitrec,
			int docrec, Integer nroparcrec, String obsrec, Character flag,
			Character altusurec, char emmanut, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set fnitrecebers) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnconta = fnconta;
		this.fntipocob = fntipocob;
		this.vdcliente = vdcliente;
		this.fnplanopag = fnplanopag;
		this.fnplanejamento = fnplanejamento;
		this.vdvenda = vdvenda;
		this.vdvendedor = vdvendedor;
		this.fnrenegrec = fnrenegrec;
		this.fnbanco = fnbanco;
		this.fncc = fncc;
		this.fncartcob = fncartcob;
		this.vlrrec = vlrrec;
		this.vlrdescrec = vlrdescrec;
		this.vlrmultarec = vlrmultarec;
		this.vlrjurosrec = vlrjurosrec;
		this.vlrdevrec = vlrdevrec;
		this.vlrparcrec = vlrparcrec;
		this.vlrpagorec = vlrpagorec;
		this.vlrapagrec = vlrapagrec;
		this.vlrbasecomis = vlrbasecomis;
		this.vlrretensaoiss = vlrretensaoiss;
		this.dtcomprec = dtcomprec;
		this.datarec = datarec;
		this.statusrec = statusrec;
		this.vlrcomirec = vlrcomirec;
		this.dtquitrec = dtquitrec;
		this.docrec = docrec;
		this.nroparcrec = nroparcrec;
		this.obsrec = obsrec;
		this.flag = flag;
		this.altusurec = altusurec;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnitrecebers = fnitrecebers;
	}

	public FnreceberId getId() {
		return this.id;
	}

	public void setId(FnreceberId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	public Fntipocob getFntipocob() {
		return this.fntipocob;
	}

	public void setFntipocob(Fntipocob fntipocob) {
		this.fntipocob = fntipocob;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	public Fnrenegrec getFnrenegrec() {
		return this.fnrenegrec;
	}

	public void setFnrenegrec(Fnrenegrec fnrenegrec) {
		this.fnrenegrec = fnrenegrec;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public Fncartcob getFncartcob() {
		return this.fncartcob;
	}

	public void setFncartcob(Fncartcob fncartcob) {
		this.fncartcob = fncartcob;
	}

	public BigDecimal getVlrrec() {
		return this.vlrrec;
	}

	public void setVlrrec(BigDecimal vlrrec) {
		this.vlrrec = vlrrec;
	}

	public BigDecimal getVlrdescrec() {
		return this.vlrdescrec;
	}

	public void setVlrdescrec(BigDecimal vlrdescrec) {
		this.vlrdescrec = vlrdescrec;
	}

	public BigDecimal getVlrmultarec() {
		return this.vlrmultarec;
	}

	public void setVlrmultarec(BigDecimal vlrmultarec) {
		this.vlrmultarec = vlrmultarec;
	}

	public BigDecimal getVlrjurosrec() {
		return this.vlrjurosrec;
	}

	public void setVlrjurosrec(BigDecimal vlrjurosrec) {
		this.vlrjurosrec = vlrjurosrec;
	}

	public BigDecimal getVlrdevrec() {
		return this.vlrdevrec;
	}

	public void setVlrdevrec(BigDecimal vlrdevrec) {
		this.vlrdevrec = vlrdevrec;
	}

	public BigDecimal getVlrparcrec() {
		return this.vlrparcrec;
	}

	public void setVlrparcrec(BigDecimal vlrparcrec) {
		this.vlrparcrec = vlrparcrec;
	}

	public BigDecimal getVlrpagorec() {
		return this.vlrpagorec;
	}

	public void setVlrpagorec(BigDecimal vlrpagorec) {
		this.vlrpagorec = vlrpagorec;
	}

	public BigDecimal getVlrapagrec() {
		return this.vlrapagrec;
	}

	public void setVlrapagrec(BigDecimal vlrapagrec) {
		this.vlrapagrec = vlrapagrec;
	}

	public BigDecimal getVlrbasecomis() {
		return this.vlrbasecomis;
	}

	public void setVlrbasecomis(BigDecimal vlrbasecomis) {
		this.vlrbasecomis = vlrbasecomis;
	}

	public BigDecimal getVlrretensaoiss() {
		return this.vlrretensaoiss;
	}

	public void setVlrretensaoiss(BigDecimal vlrretensaoiss) {
		this.vlrretensaoiss = vlrretensaoiss;
	}

	public Date getDtcomprec() {
		return this.dtcomprec;
	}

	public void setDtcomprec(Date dtcomprec) {
		this.dtcomprec = dtcomprec;
	}

	public Date getDatarec() {
		return this.datarec;
	}

	public void setDatarec(Date datarec) {
		this.datarec = datarec;
	}

	public String getStatusrec() {
		return this.statusrec;
	}

	public void setStatusrec(String statusrec) {
		this.statusrec = statusrec;
	}

	public BigDecimal getVlrcomirec() {
		return this.vlrcomirec;
	}

	public void setVlrcomirec(BigDecimal vlrcomirec) {
		this.vlrcomirec = vlrcomirec;
	}

	public Date getDtquitrec() {
		return this.dtquitrec;
	}

	public void setDtquitrec(Date dtquitrec) {
		this.dtquitrec = dtquitrec;
	}

	public int getDocrec() {
		return this.docrec;
	}

	public void setDocrec(int docrec) {
		this.docrec = docrec;
	}

	public Integer getNroparcrec() {
		return this.nroparcrec;
	}

	public void setNroparcrec(Integer nroparcrec) {
		this.nroparcrec = nroparcrec;
	}

	public String getObsrec() {
		return this.obsrec;
	}

	public void setObsrec(String obsrec) {
		this.obsrec = obsrec;
	}

	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	public Character getAltusurec() {
		return this.altusurec;
	}

	public void setAltusurec(Character altusurec) {
		this.altusurec = altusurec;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

}
