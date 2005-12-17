/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.modelbase.sql.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.1 Data types
 * 
 * A data type is a set of representable values. Every representable value belongs to at least one data type and some belong to several data types. [...]
 * 
 * A constructed type is specified using one of SQL's data type constructors, ARRAY , MULTISET , REF , and ROW . A constructed type is either an array type, a multiset type, a reference type, or a row type, according to whether it is specified with ARRAY , MULTISET , REF , or ROW , respectively. Array types and multiset types are known generically as collection types.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.CollectionDataType#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getCollectionDataType()
 * @model abstract="true"
 * @generated
 */
public interface CollectionDataType extends ConstructedDataType{
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.datatools.modelbase.sql.datatypes.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getCollectionDataType_Element()
	 * @model type="org.eclipse.datatools.modelbase.sql.datatypes.DataType" required="true"
	 * @generated
	 */
	EList getElement();

} // CollectionDataType