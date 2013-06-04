/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.constraints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Match Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * See KeyRelationship description.
 * <!-- end-model-doc -->
 * @see org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage#getMatchType()
 * @model
 * @generated
 */
public enum MatchType implements Enumerator
{
	/**
	 * The '<em><b>MATCH SIMPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATCH_SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	MATCH_SIMPLE(0, "MATCH_SIMPLE", "MATCH_SIMPLE"),
	/**
	 * The '<em><b>MATCH FULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATCH_FULL_VALUE
	 * @generated
	 * @ordered
	 */
	MATCH_FULL(1, "MATCH_FULL", "MATCH_FULL"),
	/**
	 * The '<em><b>MATCH PARTIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATCH_PARTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	MATCH_PARTIAL(2, "MATCH_PARTIAL", "MATCH_PARTIAL");
	/**
	 * The '<em><b>MATCH SIMPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MATCH SIMPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATCH_SIMPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MATCH_SIMPLE_VALUE = 0;

	/**
	 * The '<em><b>MATCH FULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MATCH FULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATCH_FULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MATCH_FULL_VALUE = 1;

	/**
	 * The '<em><b>MATCH PARTIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MATCH PARTIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATCH_PARTIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MATCH_PARTIAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Match Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MatchType[] VALUES_ARRAY =
		new MatchType[] {
			MATCH_SIMPLE,
			MATCH_FULL,
			MATCH_PARTIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Match Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MatchType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Match Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatchType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MatchType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Match Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatchType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MatchType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Match Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatchType get(int value) {
		switch (value) {
			case MATCH_SIMPLE_VALUE: return MATCH_SIMPLE;
			case MATCH_FULL_VALUE: return MATCH_FULL;
			case MATCH_PARTIAL_VALUE: return MATCH_PARTIAL;
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
	private MatchType(int value, String name, String literal) {
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
