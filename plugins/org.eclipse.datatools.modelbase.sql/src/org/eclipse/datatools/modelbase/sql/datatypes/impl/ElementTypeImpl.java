/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.CollectionDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.ElementType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.schema.impl.TypedElementImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.ElementTypeImpl#getCollectionDataType <em>Collection Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementTypeImpl extends TypedElementImpl implements ElementType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDataType getCollectionDataType() {
		return (CollectionDataType)eGet(SQLDataTypesPackage.Literals.ELEMENT_TYPE__COLLECTION_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionDataType(CollectionDataType newCollectionDataType) {
		eSet(SQLDataTypesPackage.Literals.ELEMENT_TYPE__COLLECTION_DATA_TYPE, newCollectionDataType);
	}

} //ElementTypeImpl
