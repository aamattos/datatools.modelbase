/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.schema.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.datatools.modelbase.sql.datatypes.DataType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.UserDefinedType;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.datatools.modelbase.sql.schema.TypedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.TypedElementImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.TypedElementImpl#getReferencedType <em>Referenced Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedElementImpl extends SQLObjectImpl implements TypedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLSchemaPackage.Literals.TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLDataType getContainedType() {
		return (SQLDataType)eGet(SQLSchemaPackage.Literals.TYPED_ELEMENT__CONTAINED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedType(SQLDataType newContainedType) {
		eSet(SQLSchemaPackage.Literals.TYPED_ELEMENT__CONTAINED_TYPE, newContainedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedType getReferencedType() {
		return (UserDefinedType)eGet(SQLSchemaPackage.Literals.TYPED_ELEMENT__REFERENCED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedType(UserDefinedType newReferencedType) {
		eSet(SQLSchemaPackage.Literals.TYPED_ELEMENT__REFERENCED_TYPE, newReferencedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public DataType getDataType() {
		if (this.getContainedType() != null)
			return this.getContainedType();
		else if (this.getReferencedType() != null)
			return this.getReferencedType();
		else
			return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SQLSchemaPackage.TYPED_ELEMENT___SET_DATA_TYPE__DATATYPE:
				setDataType((DataType)arguments.get(0));
				return null;
			case SQLSchemaPackage.TYPED_ELEMENT___GET_DATA_TYPE:
				return getDataType();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setDataType(DataType newType) {
		
		if (newType == null) {
			this.setReferencedType(null);
			this.setContainedType(null);
		}
		else if (newType instanceof SQLDataType) {
			if (this.getReferencedType() != null) {
				this.setReferencedType(null);
			}
			this.setContainedType((SQLDataType)newType);
		}
		else if (newType instanceof UserDefinedType) {
			if (this.getContainedType() != null) {
				this.setContainedType(null);
			}
			this.setReferencedType((UserDefinedType)newType);
		}
	}

} //TypedElementImpl
