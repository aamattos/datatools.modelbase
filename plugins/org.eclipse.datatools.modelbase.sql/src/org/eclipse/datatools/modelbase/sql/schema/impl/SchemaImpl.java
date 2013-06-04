/**
 * <copyright>
 * </copyright>
 *
 * $Id: ESchemaImpl.java,v 1.15.14.4 2013/03/14 12:39:40 n775660 Exp $
 */
package org.eclipse.datatools.modelbase.sql.schema.impl;

import org.eclipse.datatools.modelbase.sql.accesscontrol.AuthorizationIdentifier;
import org.eclipse.datatools.modelbase.sql.constraints.Assertion;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.datatypes.CharacterSet;
import org.eclipse.datatools.modelbase.sql.datatypes.UserDefinedType;
import org.eclipse.datatools.modelbase.sql.routines.BuiltInFunction;
import org.eclipse.datatools.modelbase.sql.routines.Procedure;
import org.eclipse.datatools.modelbase.sql.routines.Routine;
import org.eclipse.datatools.modelbase.sql.routines.UserDefinedFunction;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.Sequence;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.Trigger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getSequences <em>Sequences</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getUserDefinedTypes <em>User Defined Types</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getCharSets <em>Char Sets</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getRoutines <em>Routines</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends SQLObjectImpl implements Schema {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(Catalog newCatalog) {
		eSet(SQLSchemaPackage.Literals.SCHEMA__CATALOG, newCatalog);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLSchemaPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Trigger> getTriggers() {
		return (EList<Trigger>)eGet(SQLSchemaPackage.Literals.SCHEMA__TRIGGERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Index> getIndices() {
		return (EList<Index>)eGet(SQLSchemaPackage.Literals.SCHEMA__INDICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Table> getTables() {
		return (EList<Table>)eGet(SQLSchemaPackage.Literals.SCHEMA__TABLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Sequence> getSequences() {
		return (EList<Sequence>)eGet(SQLSchemaPackage.Literals.SCHEMA__SEQUENCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return (Database)eGet(SQLSchemaPackage.Literals.SCHEMA__DATABASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		eSet(SQLSchemaPackage.Literals.SCHEMA__DATABASE, newDatabase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog getCatalog() {
		return (Catalog)eGet(SQLSchemaPackage.Literals.SCHEMA__CATALOG, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Assertion> getAssertions() {
		return (EList<Assertion>)eGet(SQLSchemaPackage.Literals.SCHEMA__ASSERTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UserDefinedType> getUserDefinedTypes() {
		return (EList<UserDefinedType>)eGet(SQLSchemaPackage.Literals.SCHEMA__USER_DEFINED_TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CharacterSet> getCharSets() {
		return (EList<CharacterSet>)eGet(SQLSchemaPackage.Literals.SCHEMA__CHAR_SETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Routine> getRoutines() {
		return (EList<Routine>)eGet(SQLSchemaPackage.Literals.SCHEMA__ROUTINES, true);
	}

	   /**
	    * Get a list of procedures belonging to this schema.
	    */
	   public EList getProcedures() {
	      return getSpecializedRoutines(Procedure.class);
	   }

	   /**
	    * Get a list of user-defined functions belonging to this schema.
	    */
	   public EList getUDFs() {
	      return getSpecializedRoutines(UserDefinedFunction.class);
	   }

	   /**
	    * Get a list of built-in (aka system) functions belonging to this schema.
	    */
	   public EList getBuiltInFunctions() {
	      return getSpecializedRoutines(BuiltInFunction.class);
	   }

	   /**
	    * Get a list of Routine subclasses that match the specified argument.
	    * @param aDesiredClass any subclass of Routine
	    * @return a list of Routine subclasses that match the specified argument.
	    */
	   protected EList getSpecializedRoutines(Class aDesiredClass) {
	      EList specializedRoutines = new BasicEList();
	      EList routines = getRoutines();
	      for (int i = 0, routineCnt = routines.size(); i < routineCnt; i++) {
	         Object obj = routines.get(i);
	         if (aDesiredClass.isAssignableFrom(obj.getClass())) {
	            specializedRoutines.add(obj);
	         }
	      }
	      return specializedRoutines;
	   }
	   
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationIdentifier getOwner() {
		return (AuthorizationIdentifier)eGet(SQLSchemaPackage.Literals.SCHEMA__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(AuthorizationIdentifier newOwner) {
		eSet(SQLSchemaPackage.Literals.SCHEMA__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {		
		return getName();
	}

} //ESchemaImpl
