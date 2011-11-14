package org.freedom.modulos.crm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.freedom.infra.dao.AbstractDAO;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.modulos.crm.business.object.ContratoVW;
import org.freedom.modulos.crm.business.object.ContratoVW.EColContr;


public class DAOGestaoProj extends AbstractDAO {
	
	private Object prefs[] = null;
	
	public DAOGestaoProj( DbConnection cn) {

		super( cn );

	}
	
	public void setPrefs( Integer codempct , Integer codfilialct, Integer codcontr) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = null;
		
		prefs = new Object[ ContratoVW.EColContr.values().length ];
	
			try{
				sql = new StringBuilder( "SELECT CT.INDICE, CT.IDX, " );
				sql.append( "( CASE  " );
				sql.append( "WHEN IDX=1 THEN DESCCONTR " );
				sql.append( "WHEN IDX=2 THEN DESCITCONTR " );
				sql.append( "WHEN IDX=3 THEN DESCTAREFA " );
				sql.append( "WHEN IDX=4 THEN DESCTAREFAST " );
				sql.append( "END ) DESCRICAO, " );
				sql.append( "TIPO, CODCONTR, CODITCONTR, CODTAREFA, CODTAREFAST " );
				sql.append( "FROM VDCONTRATOVW01 CT " );
				sql.append(	"WHERE CT.CODEMPCT=? AND CT.CODFILIALCT=? AND CT.CODCONTR=? ");
				sql.append( "AND TIPO IN ('SC','TA','ST') " );
				sql.append(	"ORDER BY INDICE " );
			
				
				ps = getConn().prepareStatement( sql.toString() );
				ps.setInt( 1, codempct );
				ps.setInt( 2, codfilialct );
				ps.setInt( 3, codcontr );
				rs = ps.executeQuery();
				
				if( rs.next() ){
					prefs[ EColContr.INDICE.ordinal() ] = rs.getString( EColContr.INDICE.toString() );
					prefs[ EColContr.DESCRICAO.ordinal() ] =  rs.getString( EColContr.DESCRICAO.toString() );
					prefs[ EColContr.TIPO.ordinal() ] = rs.getString( EColContr.TIPO.toString() );
					prefs[ EColContr.CODCONTR.ordinal() ] = new Integer(rs.getInt( EColContr.CODCONTR.toString() ));
					prefs[ EColContr.CODITCONTR.ordinal() ] = new Integer(rs.getInt( EColContr.CODITCONTR.toString() ));
					prefs[ EColContr.CODTAREFA.ordinal() ] = new Integer(rs.getInt( EColContr.CODTAREFA.toString() ));
					prefs[ EColContr.CODTAREFAST.ordinal() ] = new Integer(rs.getInt( EColContr.CODTAREFAST.toString() ));
				}
				rs.close();
				ps.close();
				getConn().commit();
			} finally {
				ps = null;
				rs = null;
				sql = null;
			}
			
		}	
	
	public Vector<Vector<Object>> loadContr( Integer codempct , Integer codfilialct, Integer codcontr) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = null;
		Vector<Vector<Object >> result = new Vector<Vector<Object>>();
		
		Vector<Object> row = null;
		
	
			try{
				sql = new StringBuilder( "SELECT CT.INDICE, CT.IDX, " );
				sql.append( "( CASE  " );
				sql.append( "WHEN IDX=1 THEN DESCCONTR " );
				sql.append( "WHEN IDX=2 THEN DESCITCONTR " );
				sql.append( "WHEN IDX=3 THEN DESCTAREFA " );
				sql.append( "WHEN IDX=4 THEN DESCTAREFAST " );
				sql.append( "END ) DESCRICAO, " );
				sql.append( "TIPO, CODCONTR, CODITCONTR, CODTAREFA, CODTAREFAST " );
				sql.append( "FROM VDCONTRATOVW01 CT " );
				sql.append(	"WHERE CT.CODEMPCT=? AND CT.CODFILIALCT=? AND CT.CODCONTR=? ");
				sql.append( "AND TIPO IN ('SC','TA','ST') " );
				sql.append(	"ORDER BY INDICE " );
			
				
				ps = getConn().prepareStatement( sql.toString() );
				ps.setInt( 1, codempct );
				ps.setInt( 2, codfilialct );
				ps.setInt( 3, codcontr );
				rs = ps.executeQuery();
				
				while( rs.next() ){
					row = new Vector<Object>();
					row.addElement( rs.getString( EColContr.INDICE.toString() ) );
					row.addElement( rs.getString( EColContr.TIPO.toString() ) );
					row.addElement( rs.getString( EColContr.DESCRICAO.toString() ) );
					row.addElement( new Integer(rs.getInt( EColContr.CODCONTR.toString() ) ) );
					row.addElement( new Integer(rs.getInt( EColContr.CODITCONTR.toString() ) ) );
					row.addElement( new Integer(rs.getInt( EColContr.CODTAREFA.toString() ) ) );
					row.addElement( new Integer(rs.getInt( EColContr.CODTAREFAST.toString() ) ) );
					result.addElement( row );
				}
				rs.close();
				ps.close();
				getConn().commit();
			} finally {
				ps = null;
				rs = null;
				sql = null;
			}
			return result;
		}	
	
	public Integer getNewIndiceItemContr(Integer codemp, Integer codfilial, Integer codcontr) throws SQLException	{
		
		Integer result = null;
		StringBuilder sql = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try{
			sql = new StringBuilder();
			sql.append( "SELECT COALESCE(MAX(IC.INDEXITCONTR),0)+1 INDEXITCONTR " );
			sql.append( "FROM VDITCONTRATO IC " );
			sql.append( "WHERE CODEMP=? AND CODFILIAL=? AND CODCONTR=?" );

			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, codemp );
			ps.setInt( 2, codfilial );
			ps.setInt( 3, codcontr );
			rs = ps.executeQuery();
			
			if( rs.next() ){
				result = new Integer( rs.getInt( "INDEXITCONTR" ) );		
			} else {
				result = 1;
			}
			
			rs.close();
			ps.close();
			getConn().commit();
			
		} finally {
			ps = null;
			rs = null;
			sql = null;
		}
		
		
		
		return result;
	}
	
	public Integer getNewIndiceItemTarefa(Integer codempct, Integer codfilialct, Integer codcontr, Integer coditcontr) throws SQLException	{
		
		Integer result = null;
		StringBuilder sql = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try{

			sql = new StringBuilder();
			sql.append( "SELECT COALESCE(MAX(TA.INDEXTAREFA),0)+1 INDEXTAREFA " );
			sql.append( "FROM CRTAREFA TA " );
			sql.append( "WHERE CODEMPCT=? AND CODFILIALCT=? AND CODCONTR=?  AND CODITCONTR=?" );

			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, codempct );
			ps.setInt( 2, codfilialct );
			ps.setInt( 3, codcontr );
			ps.setInt( 4, coditcontr );
			rs = ps.executeQuery();
			
			if( rs.next() ){
				result = new Integer( rs.getInt( "INDEXTAREFA" ) );		
			} else {
				result = 1;
			}
			
			rs.close();
			ps.close();
			getConn().commit();
			
		} finally {
			ps = null;
			rs = null;
			sql = null;
		}
		
		return result;
	}
	
	public Integer getNewIndiceItemSubTarefa(Integer codempta, Integer codfilialta, Integer codtarefa) throws SQLException	{
		
		Integer result = null;
		StringBuilder sql = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try{

			sql = new StringBuilder();
			sql.append( "SELECT COALESCE(MAX(TA.INDEXTAREFA),0)+1 INDEXTAREFA " );
			sql.append( "FROM CRTAREFA TA " );
			sql.append( "WHERE CODEMP=? AND CODFILIAL=? AND CODTAREFA=?" );

			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, codempta );
			ps.setInt( 2, codfilialta );
			ps.setInt( 3, codtarefa );
			rs = ps.executeQuery();
			
			if( rs.next() ){
				result = new Integer( rs.getInt( "INDEXTAREFA" ) );		
			} else {
				result = 1;
			}
			
			rs.close();
			ps.close();
			getConn().commit();
			
		} finally {
			ps = null;
			rs = null;
			sql = null;
		}
		
		return result;
	}
	
	public Integer getCodContr(Integer codemp, Integer codfilial, Integer codtarefa) throws SQLException{
		Integer result = null;
		StringBuilder sql = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try{

			sql = new StringBuilder();
			sql.append( "SELECT CODCONTR " );
			sql.append( "FROM CRTAREFA TA " );
			sql.append( "WHERE CODEMP=? AND CODFILIAL=? AND CODTAREFA=?" );

			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, codemp );
			ps.setInt( 2, codfilial );
			ps.setInt( 3, codtarefa );
			rs = ps.executeQuery();

			if( rs.next() ){
				result = new Integer( rs.getInt( "CODCONTR" ) );		
			} else {
				result = null;
			}
			rs.close();
			ps.close();
			getConn().commit();
		} finally {
			ps = null;
			rs = null;
			sql = null;
		}

		return result;
	}
	public Integer getCodItContr(Integer codemp, Integer codfilial, Integer codtarefa) throws SQLException{
		Integer result = null;
		StringBuilder sql = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try{

			sql = new StringBuilder();
			sql.append( "SELECT CODITCONTR " );
			sql.append( "FROM CRTAREFA TA " );
			sql.append( "WHERE CODEMP=? AND CODFILIAL=? AND CODTAREFA=?" );

			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, codemp );
			ps.setInt( 2, codfilial );
			ps.setInt( 3, codtarefa );
			rs = ps.executeQuery();

			if( rs.next() ){
				result = new Integer( rs.getInt( "CODITCONTR" ) );		
			} else {
				result = null;
			}
			rs.close();
			ps.close();
			getConn().commit();
		} finally {
			ps = null;
			rs = null;
			sql = null;
		}

		return result;
	}
	
	

	
}