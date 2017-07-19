/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gateway.my.Car#getId <em>Id</em>}</li>
 *   <li>{@link gateway.my.Car#getName <em>Name</em>}</li>
 *   <li>{@link gateway.my.Car#getModel <em>Model</em>}</li>
 *   <li>{@link gateway.my.Car#getYear <em>Year</em>}</li>
 *   <li>{@link gateway.my.Car#getPrice <em>Price</em>}</li>
 *   <li>{@link gateway.my.Car#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see gateway.my.MyPackage#getCar()
 * @model extendedMetaData="name='Car' kind='elementOnly'"
 * @generated
 */
public interface Car
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see gateway.my.MyPackage#getCar_Id()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='id'"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link gateway.my.Car#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see gateway.my.MyPackage#getCar_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link gateway.my.Car#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' attribute.
   * @see #setModel(String)
   * @see gateway.my.MyPackage#getCar_Model()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='model'"
   * @generated
   */
  String getModel();

  /**
   * Sets the value of the '{@link gateway.my.Car#getModel <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' attribute.
   * @see #getModel()
   * @generated
   */
  void setModel(String value);

  /**
   * Returns the value of the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Year</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year</em>' attribute.
   * @see #setYear(String)
   * @see gateway.my.MyPackage#getCar_Year()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='year'"
   * @generated
   */
  String getYear();

  /**
   * Sets the value of the '{@link gateway.my.Car#getYear <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' attribute.
   * @see #getYear()
   * @generated
   */
  void setYear(String value);

  /**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Price</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #isSetPrice()
   * @see #unsetPrice()
   * @see #setPrice(int)
   * @see gateway.my.MyPackage#getCar_Price()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
   *        extendedMetaData="kind='element' name='price'"
   * @generated
   */
  int getPrice();

  /**
   * Sets the value of the '{@link gateway.my.Car#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #isSetPrice()
   * @see #unsetPrice()
   * @see #getPrice()
   * @generated
   */
  void setPrice(int value);

  /**
   * Unsets the value of the '{@link gateway.my.Car#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetPrice()
   * @see #getPrice()
   * @see #setPrice(int)
   * @generated
   */
  void unsetPrice();

  /**
   * Returns whether the value of the '{@link gateway.my.Car#getPrice <em>Price</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Price</em>' attribute is set.
   * @see #unsetPrice()
   * @see #getPrice()
   * @see #setPrice(int)
   * @generated
   */
  boolean isSetPrice();

  /**
   * Returns the value of the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec</em>' containment reference.
   * @see #setSpec(Specs)
   * @see gateway.my.MyPackage#getCar_Spec()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='spec'"
   * @generated
   */
  Specs getSpec();

  /**
   * Sets the value of the '{@link gateway.my.Car#getSpec <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spec</em>' containment reference.
   * @see #getSpec()
   * @generated
   */
  void setSpec(Specs value);

} // Car
