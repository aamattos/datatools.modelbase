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
package org.eclipse.datatools.modelbase.sql.schema.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.datatools.modelbase.sql.accesscontrol.Privilege;
import org.eclipse.datatools.modelbase.sql.schema.Comment;
import org.eclipse.datatools.modelbase.sql.schema.Dependency;
import org.eclipse.datatools.modelbase.sql.schema.ObjectExtension;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl#getPrivileges <em>Privileges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public abstract class SQLObjectImpl extends ENamedElementImpl implements SQLObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLSchemaPackage.Literals.SQL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Dependency> getDependencies() {
		return (EList<Dependency>)eGet(SQLSchemaPackage.Literals.SQL_OBJECT__DEPENDENCIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(SQLSchemaPackage.Literals.SQL_OBJECT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(SQLSchemaPackage.Literals.SQL_OBJECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(SQLSchemaPackage.Literals.SQL_OBJECT__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(SQLSchemaPackage.Literals.SQL_OBJECT__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Comment> getComments() {
		return (EList<Comment>)eGet(SQLSchemaPackage.Literals.SQL_OBJECT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ObjectExtension> getExtensions() {
		return (EList<ObjectExtension>)eGet(SQLSchemaPackage.Literals.SQL_OBJECT__EXTENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Privilege> getPrivileges() {
		return (EList<Privilege>)eGet(SQLSchemaPackage.Literals.SQL_OBJECT__PRIVILEGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EAnnotation addEAnnotation(String source) {
		EAnnotation eAnnotation = this.getEAnnotation(source);
		if (eAnnotation == null) {
			eAnnotation = (EAnnotation)EcoreFactory.eINSTANCE.create(EcorePackage.eINSTANCE.getEAnnotation());
			eAnnotation.setSource(source);
			this.getEAnnotations().add(eAnnotation);
		}
		
		return eAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addEAnnotationDetail(EAnnotation eAnnotation, String key, String value) {
		if (eAnnotation != null) {
			EStringToStringMapEntryImpl mapEntry =
				(EStringToStringMapEntryImpl)EcoreFactory.eINSTANCE.create(EcorePackage.eINSTANCE.getEStringToStringMapEntry());
				
			mapEntry.setTypedKey(key);
			mapEntry.setTypedValue(value);
			eAnnotation.getDetails().add(mapEntry);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getEAnnotationDetail(EAnnotation eAnnotation, String key) {
		String value = ""; //$NON-NLS-1$
		if (eAnnotation != null) {
			Iterator eAnnotationDetailsIterator = eAnnotation.getDetails().iterator();
			while(eAnnotationDetailsIterator.hasNext()) {
				EStringToStringMapEntryImpl currentMapEntry = (EStringToStringMapEntryImpl)eAnnotationDetailsIterator.next();
				if (currentMapEntry.getTypedKey().equalsIgnoreCase(key)) {
					value = currentMapEntry.getTypedValue();
				}
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setAnnotationDetail(EAnnotation eAnnotation, String key, String value) {
		if (eAnnotation != null) {
			Iterator eAnnotationDetailsIterator = eAnnotation.getDetails().iterator();
			while(eAnnotationDetailsIterator.hasNext()) {
				EStringToStringMapEntryImpl currentMapEntry = (EStringToStringMapEntryImpl)eAnnotationDetailsIterator.next();
				if (currentMapEntry.getTypedKey().equalsIgnoreCase(key)) {
					currentMapEntry.setTypedValue(value);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeEAnnotationDetail(EAnnotation eAnnotation, String key) {
		if (eAnnotation != null) {
	         BasicEList deferredRemove = new BasicEList();
				Iterator eAnnotationDetailsIterator = eAnnotation.getDetails().iterator();
				while(eAnnotationDetailsIterator.hasNext()) {
					EStringToStringMapEntryImpl currentMapEntry = (EStringToStringMapEntryImpl)eAnnotationDetailsIterator.next();
					if (currentMapEntry.getTypedKey().equalsIgnoreCase(key)) {
	               deferredRemove.add(currentMapEntry);
					}
				}
	         for (Iterator iter = deferredRemove.iterator(); iter.hasNext();) {
	            eAnnotation.getDetails().remove(iter.next());
	         }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SQLSchemaPackage.SQL_OBJECT___ADD_EANNOTATION__STRING:
				return addEAnnotation((String)arguments.get(0));
			case SQLSchemaPackage.SQL_OBJECT___ADD_EANNOTATION_DETAIL__EANNOTATION_STRING_STRING:
				addEAnnotationDetail((EAnnotation)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case SQLSchemaPackage.SQL_OBJECT___GET_EANNOTATION_DETAIL__EANNOTATION_STRING:
				return getEAnnotationDetail((EAnnotation)arguments.get(0), (String)arguments.get(1));
			case SQLSchemaPackage.SQL_OBJECT___SET_ANNOTATION_DETAIL__EANNOTATION_STRING_STRING:
				setAnnotationDetail((EAnnotation)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case SQLSchemaPackage.SQL_OBJECT___REMOVE_EANNOTATION_DETAIL__EANNOTATION_STRING:
				removeEAnnotationDetail((EAnnotation)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EAnnotation getEAnnotation(String source) {
		EAnnotation eAnnotation = null;
		Iterator eAnnotationIterator = this.getEAnnotations().iterator();
		while(eAnnotationIterator.hasNext()) {
			EAnnotation currentEAnnotation = (EAnnotation)eAnnotationIterator.next();
			if (currentEAnnotation.getSource().equalsIgnoreCase(source)) {
				eAnnotation = currentEAnnotation;
			}
		}
		return eAnnotation;
	}

} //SQLObjectImpl
