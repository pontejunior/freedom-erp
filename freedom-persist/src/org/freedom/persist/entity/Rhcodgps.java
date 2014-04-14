package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rhcodgps generated by hbm2java
 */
public class Rhcodgps implements java.io.Serializable {

	private String codgps;
	private String descgps;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdtransps = new HashSet(0);

	public Rhcodgps() {
	}

	public Rhcodgps(String codgps, Date dtins, Date hins, String idusuins) {
		this.codgps = codgps;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhcodgps(String codgps, String descgps, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdtransps) {
		this.codgps = codgps;
		this.descgps = descgps;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdtransps = vdtransps;
	}

	public String getCodgps() {
		return this.codgps;
	}

	public void setCodgps(String codgps) {
		this.codgps = codgps;
	}

	public String getDescgps() {
		return this.descgps;
	}

	public void setDescgps(String descgps) {
		this.descgps = descgps;
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

	public Set getVdtransps() {
		return this.vdtransps;
	}

	public void setVdtransps(Set vdtransps) {
		this.vdtransps = vdtransps;
	}

}
