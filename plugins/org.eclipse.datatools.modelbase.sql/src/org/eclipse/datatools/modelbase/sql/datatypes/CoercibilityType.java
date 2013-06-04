/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coercibility Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 4.2.1 Comparison of character strings
 * 
 * <!-- end-model-doc -->
 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getCoercibilityType()
 * @model
 * @generated
 */
public enum CoercibilityType implements Enumerator
{
	/**
	 * The '<em><b>IMPLICIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLICIT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLICIT(0, "IMPLICIT", "IMPLICIT"),
	/**
	 * The '<em><b>EXPLICIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLICIT(1, "EXPLICIT", "EXPLICIT"),
	/**
	 * The '<em><b>COERCIBILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COERCIBILE_VALUE
	 * @generated
	 * @ordered
	 */
	COERCIBILE(2, "COERCIBILE", "COERCIBILE"),
	/**
	 * The '<em><b>NO COLLATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_COLLATION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_COLLATION(3, "NO_COLLATION", "NO_COLLATION");
	/**
	 * The '<em><b>IMPLICIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPLICIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLICIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPLICIT_VALUE = 0;

	/**
	 * The '<em><b>EXPLICIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPLICIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPLICIT_VALUE = 1;

	/**
	 * The '<em><b>COERCIBILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COERCIBILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COERCIBILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COERCIBILE_VALUE = 2;

	/**
	 * The '<em><b>NO COLLATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO COLLATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_COLLATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_COLLATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Coercibility Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CoercibilityType[] VALUES_ARRAY =
		new CoercibilityType[] {
			IMPLICIT,
			EXPLICIT,
			COERCIBILE,
			NO_COLLATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Coercibility Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CoercibilityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coercibility Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoercibilityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoercibilityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coercibility Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoercibilityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoercibilityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coercibility Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoercibilityType get(int value) {
		switch (value) {
			case IMPLICIT_VALUE: return IMPLICIT;
			case EXPLICIT_VALUE: return EXPLICIT;
			case COERCIBILE_VALUE: return COERCIBILE;
			case NO_COLLATION_VALUE: return NO_COLLATION;
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
	private CoercibilityType(int value, String name, String literal) {
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
}
