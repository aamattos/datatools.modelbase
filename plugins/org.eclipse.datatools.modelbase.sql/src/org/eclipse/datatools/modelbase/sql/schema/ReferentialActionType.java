/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferentialActionType.java,v 1.3 2006/09/07 00:19:47 dpchou Exp $
 */
package org.eclipse.datatools.modelbase.sql.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Referential Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 
 * <!-- end-model-doc -->
 * @see org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage#getReferentialActionType()
 * @model
 * @generated
 */
public enum ReferentialActionType implements Enumerator
{
	/**
	 * The '<em><b>NO ACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO ACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION
	 * @generated
	 * @ordered
	 */
	NO_ACTION_LITERAL(0, "NO_ACTION", "NO_ACTION"),
	/**
	 * The '<em><b>RESTRICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESTRICT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTRICT
	 * @generated
	 * @ordered
	 */
	RESTRICT_LITERAL(1, "RESTRICT", "RESTRICT"),
	/**
	 * The '<em><b>CASCADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASCADE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASCADE
	 * @generated
	 * @ordered
	 */
	CASCADE_LITERAL(2, "CASCADE", "CASCADE"),
	/**
	 * The '<em><b>SET NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_NULL
	 * @generated
	 * @ordered
	 */
	SET_NULL_LITERAL(3, "SET_NULL", "SET_NULL"),
	/**
	 * The '<em><b>SET DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_DEFAULT
	 * @generated
	 * @ordered
	 */
	SET_DEFAULT_LITERAL(4, "SET_DEFAULT", "SET_DEFAULT");
	/**
	 * The '<em><b>NO ACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_ACTION = 0;

	/**
	 * The '<em><b>RESTRICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRICT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICT = 1;

	/**
	 * The '<em><b>CASCADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASCADE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE = 2;

	/**
	 * The '<em><b>SET NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_NULL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_NULL = 3;

	/**
	 * The '<em><b>SET DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_DEFAULT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_DEFAULT = 4;

	/**
	 * An array of all the '<em><b>Referential Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferentialActionType[] VALUES_ARRAY =
		new ReferentialActionType[] {
			NO_ACTION_LITERAL,
			RESTRICT_LITERAL,
			CASCADE_LITERAL,
			SET_NULL_LITERAL,
			SET_DEFAULT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Referential Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferentialActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Referential Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferentialActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferentialActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Referential Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferentialActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferentialActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Referential Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferentialActionType get(int value) {
		switch (value) {
			case NO_ACTION: return NO_ACTION_LITERAL;
			case RESTRICT: return RESTRICT_LITERAL;
			case CASCADE: return CASCADE_LITERAL;
			case SET_NULL: return SET_NULL_LITERAL;
			case SET_DEFAULT: return SET_DEFAULT_LITERAL;
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
	private ReferentialActionType(int value, String name, String literal) {
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
