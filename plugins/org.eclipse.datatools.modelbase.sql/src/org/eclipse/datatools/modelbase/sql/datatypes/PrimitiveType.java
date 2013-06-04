/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveType.java,v 1.4 2006/10/18 18:37:56 avainchte Exp $
 */
package org.eclipse.datatools.modelbase.sql.datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 4.1 Data types
 * <!-- end-model-doc -->
 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getPrimitiveType()
 * @model
 * @generated
 */
public enum PrimitiveType implements Enumerator
{
	/**
	 * The '<em><b>CHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER
	 * @generated
	 * @ordered
	 */
	CHARACTER_LITERAL(0, "CHARACTER", "CHARACTER"),
	/**
	 * The '<em><b>CHARACTER VARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTER VARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_VARYING
	 * @generated
	 * @ordered
	 */
	CHARACTER_VARYING_LITERAL(1, "CHARACTER_VARYING", "CHARACTER_VARYING"),
	/**
	 * The '<em><b>CHARACTER LARGE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTER LARGE OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_LARGE_OBJECT
	 * @generated
	 * @ordered
	 */
	CHARACTER_LARGE_OBJECT_LITERAL(2, "CHARACTER_LARGE_OBJECT", "CHARACTER_LARGE_OBJECT"),
	/**
	 * The '<em><b>NATIONAL CHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONAL CHARACTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER
	 * @generated
	 * @ordered
	 */
	NATIONAL_CHARACTER_LITERAL(3, "NATIONAL_CHARACTER", "NATIONAL_CHARACTER"),
	/**
	 * The '<em><b>NATIONAL CHARACTER VARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONAL CHARACTER VARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_VARYING
	 * @generated
	 * @ordered
	 */
	NATIONAL_CHARACTER_VARYING_LITERAL(4, "NATIONAL_CHARACTER_VARYING", "NATIONAL_CHARACTER_VARYING"),
	/**
	 * The '<em><b>NATIONAL CHARACTER LARGE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONAL CHARACTER LARGE OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_LARGE_OBJECT
	 * @generated
	 * @ordered
	 */
	NATIONAL_CHARACTER_LARGE_OBJECT_LITERAL(5, "NATIONAL_CHARACTER_LARGE_OBJECT", "NATIONAL_CHARACTER_LARGE_OBJECT"),
	/**
	 * The '<em><b>BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @generated
	 * @ordered
	 */
	BINARY_LITERAL(6, "BINARY", "BINARY"),
	/**
	 * The '<em><b>BINARY VARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINARY VARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY_VARYING
	 * @generated
	 * @ordered
	 */
	BINARY_VARYING_LITERAL(7, "BINARY_VARYING", "BINARY_VARYING"),
	/**
	 * The '<em><b>BINARY LARGE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINARY LARGE OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY_LARGE_OBJECT
	 * @generated
	 * @ordered
	 */
	BINARY_LARGE_OBJECT_LITERAL(8, "BINARY_LARGE_OBJECT", "BINARY_LARGE_OBJECT"),
	/**
	 * The '<em><b>NUMERIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMERIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @generated
	 * @ordered
	 */
	NUMERIC_LITERAL(9, "NUMERIC", "NUMERIC"),
	/**
	 * The '<em><b>DECIMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECIMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @generated
	 * @ordered
	 */
	DECIMAL_LITERAL(10, "DECIMAL", "DECIMAL"),
	/**
	 * The '<em><b>SMALLINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMALLINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLINT
	 * @generated
	 * @ordered
	 */
	SMALLINT_LITERAL(11, "SMALLINT", "SMALLINT"),
	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @generated
	 * @ordered
	 */
	INTEGER_LITERAL(12, "INTEGER", "INTEGER"),
	/**
	 * The '<em><b>BIGINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIGINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIGINT
	 * @generated
	 * @ordered
	 */
	BIGINT_LITERAL(13, "BIGINT", "BIGINT"),
	/**
	 * The '<em><b>FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @generated
	 * @ordered
	 */
	FLOAT_LITERAL(14, "FLOAT", "FLOAT"),
	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @generated
	 * @ordered
	 */
	REAL_LITERAL(15, "REAL", "REAL"),
	/**
	 * The '<em><b>DOUBLE PRECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE PRECISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PRECISION
	 * @generated
	 * @ordered
	 */
	DOUBLE_PRECISION_LITERAL(16, "DOUBLE_PRECISION", "DOUBLE_PRECISION"),
	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @generated
	 * @ordered
	 */
	BOOLEAN_LITERAL(17, "BOOLEAN", "BOOLEAN"),
	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @generated
	 * @ordered
	 */
	DATE_LITERAL(18, "DATE", "DATE"),
	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @generated
	 * @ordered
	 */
	TIME_LITERAL(19, "TIME", "TIME"),
	/**
	 * The '<em><b>TIMESTAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMESTAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @generated
	 * @ordered
	 */
	TIMESTAMP_LITERAL(20, "TIMESTAMP", "TIMESTAMP"),
	/**
	 * The '<em><b>INTERVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVAL
	 * @generated
	 * @ordered
	 */
	INTERVAL_LITERAL(21, "INTERVAL", "INTERVAL"),
	/**
	 * The '<em><b>DATALINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATALINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATALINK
	 * @generated
	 * @ordered
	 */
	DATALINK_LITERAL(22, "DATALINK", "DATALINK"),
	/**
	 * The '<em><b>XML TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XML TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML_TYPE
	 * @generated
	 * @ordered
	 */
	XML_TYPE_LITERAL(23, "XML_TYPE", "XML_TYPE");
	/**
	 * The '<em><b>CHARACTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER = 0;

	/**
	 * The '<em><b>CHARACTER VARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_VARYING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_VARYING = 1;

	/**
	 * The '<em><b>CHARACTER LARGE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_LARGE_OBJECT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_LARGE_OBJECT = 2;

	/**
	 * The '<em><b>NATIONAL CHARACTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_CHARACTER = 3;

	/**
	 * The '<em><b>NATIONAL CHARACTER VARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_VARYING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_CHARACTER_VARYING = 4;

	/**
	 * The '<em><b>NATIONAL CHARACTER LARGE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_LARGE_OBJECT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_CHARACTER_LARGE_OBJECT = 5;

	/**
	 * The '<em><b>BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY = 6;

	/**
	 * The '<em><b>BINARY VARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VARYING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VARYING = 7;

	/**
	 * The '<em><b>BINARY LARGE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_LARGE_OBJECT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_LARGE_OBJECT = 8;

	/**
	 * The '<em><b>NUMERIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC = 9;

	/**
	 * The '<em><b>DECIMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL = 10;

	/**
	 * The '<em><b>SMALLINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLINT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALLINT = 11;

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER = 12;

	/**
	 * The '<em><b>BIGINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGINT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIGINT = 13;

	/**
	 * The '<em><b>FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT = 14;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL = 15;

	/**
	 * The '<em><b>DOUBLE PRECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PRECISION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_PRECISION = 16;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN = 17;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE = 18;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME = 19;

	/**
	 * The '<em><b>TIMESTAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP = 20;

	/**
	 * The '<em><b>INTERVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL = 21;

	/**
	 * The '<em><b>DATALINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATALINK_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATALINK = 22;

	/**
	 * The '<em><b>XML TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_TYPE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE = 23;

	/**
	 * An array of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveType[] VALUES_ARRAY =
		new PrimitiveType[] {
			CHARACTER_LITERAL,
			CHARACTER_VARYING_LITERAL,
			CHARACTER_LARGE_OBJECT_LITERAL,
			NATIONAL_CHARACTER_LITERAL,
			NATIONAL_CHARACTER_VARYING_LITERAL,
			NATIONAL_CHARACTER_LARGE_OBJECT_LITERAL,
			BINARY_LITERAL,
			BINARY_VARYING_LITERAL,
			BINARY_LARGE_OBJECT_LITERAL,
			NUMERIC_LITERAL,
			DECIMAL_LITERAL,
			SMALLINT_LITERAL,
			INTEGER_LITERAL,
			BIGINT_LITERAL,
			FLOAT_LITERAL,
			REAL_LITERAL,
			DOUBLE_PRECISION_LITERAL,
			BOOLEAN_LITERAL,
			DATE_LITERAL,
			TIME_LITERAL,
			TIMESTAMP_LITERAL,
			INTERVAL_LITERAL,
			DATALINK_LITERAL,
			XML_TYPE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrimitiveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveType get(int value) {
		switch (value) {
			case CHARACTER: return CHARACTER_LITERAL;
			case CHARACTER_VARYING: return CHARACTER_VARYING_LITERAL;
			case CHARACTER_LARGE_OBJECT: return CHARACTER_LARGE_OBJECT_LITERAL;
			case NATIONAL_CHARACTER: return NATIONAL_CHARACTER_LITERAL;
			case NATIONAL_CHARACTER_VARYING: return NATIONAL_CHARACTER_VARYING_LITERAL;
			case NATIONAL_CHARACTER_LARGE_OBJECT: return NATIONAL_CHARACTER_LARGE_OBJECT_LITERAL;
			case BINARY: return BINARY_LITERAL;
			case BINARY_VARYING: return BINARY_VARYING_LITERAL;
			case BINARY_LARGE_OBJECT: return BINARY_LARGE_OBJECT_LITERAL;
			case NUMERIC: return NUMERIC_LITERAL;
			case DECIMAL: return DECIMAL_LITERAL;
			case SMALLINT: return SMALLINT_LITERAL;
			case INTEGER: return INTEGER_LITERAL;
			case BIGINT: return BIGINT_LITERAL;
			case FLOAT: return FLOAT_LITERAL;
			case REAL: return REAL_LITERAL;
			case DOUBLE_PRECISION: return DOUBLE_PRECISION_LITERAL;
			case BOOLEAN: return BOOLEAN_LITERAL;
			case DATE: return DATE_LITERAL;
			case TIME: return TIME_LITERAL;
			case TIMESTAMP: return TIMESTAMP_LITERAL;
			case INTERVAL: return INTERVAL_LITERAL;
			case DATALINK: return DATALINK_LITERAL;
			case XML_TYPE: return XML_TYPE_LITERAL;
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
	private PrimitiveType(int value, String name, String literal) {
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
