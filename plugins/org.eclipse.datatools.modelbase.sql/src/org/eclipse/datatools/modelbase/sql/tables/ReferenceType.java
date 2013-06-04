/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.tables;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage#getReferenceType()
 * @model
 * @generated
 */
public enum ReferenceType implements Enumerator {
	/**
	 * The '<em><b>SYSTEM GENERATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_GENERATED_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_GENERATED(0, "SYSTEM_GENERATED", "SYSTEM_GENERATED"),

	/**
	 * The '<em><b>USER GENERATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_GENERATED_VALUE
	 * @generated
	 * @ordered
	 */
	USER_GENERATED(1, "USER_GENERATED", "USER_GENERATED"),

	/**
	 * The '<em><b>DERIVED SELF REF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_SELF_REF_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_SELF_REF(2, "DERIVED_SELF_REF", "DERIVED_SELF_REF");

	/**
	 * The '<em><b>SYSTEM GENERATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEM GENERATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_GENERATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_GENERATED_VALUE = 0;

	/**
	 * The '<em><b>USER GENERATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER GENERATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_GENERATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_GENERATED_VALUE = 1;

	/**
	 * The '<em><b>DERIVED SELF REF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DERIVED SELF REF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERIVED_SELF_REF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_SELF_REF_VALUE = 2;

	/**
	 * An array of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceType[] VALUES_ARRAY =
		new ReferenceType[] {
			SYSTEM_GENERATED,
			USER_GENERATED,
			DERIVED_SELF_REF,
		};

	/**
	 * A public read-only list of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceType get(int value) {
		switch (value) {
			case SYSTEM_GENERATED_VALUE: return SYSTEM_GENERATED;
			case USER_GENERATED_VALUE: return USER_GENERATED;
			case DERIVED_SELF_REF_VALUE: return DERIVED_SELF_REF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReferenceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
	/*******************DEJAMOS ESTA SECCION POR COMPATIBILIDAD CON LOS PLUGINS QUE USAN EL DATATOOLS GENERADO CON COMPLIANCE 1.4 ***********************

	
	/**
	 * The '<em><b>SYSTEM GENERATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEM GENERATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_GENERATED
	 * @generated NOT
	 * @ordered
	 */
	public static final ReferenceType SYSTEM_GENERATED_LITERAL = SYSTEM_GENERATED; //$NON-NLS-1$

	/**
	 * The '<em><b>USER GENERATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER GENERATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_GENERATED
	 * @generated NOT
	 * @ordered
	 */
	public static final ReferenceType USER_GENERATED_LITERAL = USER_GENERATED; //$NON-NLS-1$

	/**
	 * The '<em><b>DERIVED SELF REF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DERIVED SELF REF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERIVED_SELF_REF
	 * @generated NOT
	 * @ordered
	 */
	public static final ReferenceType DERIVED_SELF_REF_LITERAL = DERIVED_SELF_REF; //$NON-NLS-1$

	
} //ReferenceType
