/**
 */
package DataDictionary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataDictionary.CollectionDataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see DataDictionary.DataDictionaryPackage#getCollectionDataType()
 * @model
 * @generated
 */
public interface CollectionDataType extends DataType {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see DataDictionary.DataDictionaryPackage#getCollectionDataType_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link DataDictionary.CollectionDataType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);
} // CollectionDataType
