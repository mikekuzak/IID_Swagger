/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gateway.my.Specs#getId <em>Id</em>}</li>
 *   <li>{@link gateway.my.Specs#getColor <em>Color</em>}</li>
 *   <li>{@link gateway.my.Specs#getMph <em>Mph</em>}</li>
 *   <li>{@link gateway.my.Specs#getPs <em>Ps</em>}</li>
 * </ul>
 * </p>
 *
 * @see gateway.my.MyPackage#getSpecs()
 * @model extendedMetaData="name='Specs' kind='elementOnly'"
 * @generated
 */
public interface Specs
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
   * @see #isSetId()
   * @see #unsetId()
   * @see #setId(int)
   * @see gateway.my.MyPackage#getSpecs_Id()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
   *        extendedMetaData="kind='element' name='id'"
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link gateway.my.Specs#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #isSetId()
   * @see #unsetId()
   * @see #getId()
   * @generated
   */
  void setId(int value);

  /**
   * Unsets the value of the '{@link gateway.my.Specs#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetId()
   * @see #getId()
   * @see #setId(int)
   * @generated
   */
  void unsetId();

  /**
   * Returns whether the value of the '{@link gateway.my.Specs#getId <em>Id</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Id</em>' attribute is set.
   * @see #unsetId()
   * @see #getId()
   * @see #setId(int)
   * @generated
   */
  boolean isSetId();

  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see #setColor(String)
   * @see gateway.my.MyPackage#getSpecs_Color()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='color'"
   * @generated
   */
  String getColor();

  /**
   * Sets the value of the '{@link gateway.my.Specs#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see #getColor()
   * @generated
   */
  void setColor(String value);

  /**
   * Returns the value of the '<em><b>Mph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mph</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mph</em>' attribute.
   * @see #isSetMph()
   * @see #unsetMph()
   * @see #setMph(int)
   * @see gateway.my.MyPackage#getSpecs_Mph()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
   *        extendedMetaData="kind='element' name='mph'"
   * @generated
   */
  int getMph();

  /**
   * Sets the value of the '{@link gateway.my.Specs#getMph <em>Mph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mph</em>' attribute.
   * @see #isSetMph()
   * @see #unsetMph()
   * @see #getMph()
   * @generated
   */
  void setMph(int value);

  /**
   * Unsets the value of the '{@link gateway.my.Specs#getMph <em>Mph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetMph()
   * @see #getMph()
   * @see #setMph(int)
   * @generated
   */
  void unsetMph();

  /**
   * Returns whether the value of the '{@link gateway.my.Specs#getMph <em>Mph</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Mph</em>' attribute is set.
   * @see #unsetMph()
   * @see #getMph()
   * @see #setMph(int)
   * @generated
   */
  boolean isSetMph();

  /**
   * Returns the value of the '<em><b>Ps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ps</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ps</em>' attribute.
   * @see #isSetPs()
   * @see #unsetPs()
   * @see #setPs(int)
   * @see gateway.my.MyPackage#getSpecs_Ps()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
   *        extendedMetaData="kind='element' name='ps'"
   * @generated
   */
  int getPs();

  /**
   * Sets the value of the '{@link gateway.my.Specs#getPs <em>Ps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ps</em>' attribute.
   * @see #isSetPs()
   * @see #unsetPs()
   * @see #getPs()
   * @generated
   */
  void setPs(int value);

  /**
   * Unsets the value of the '{@link gateway.my.Specs#getPs <em>Ps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetPs()
   * @see #getPs()
   * @see #setPs(int)
   * @generated
   */
  void unsetPs();

  /**
   * Returns whether the value of the '{@link gateway.my.Specs#getPs <em>Ps</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Ps</em>' attribute is set.
   * @see #unsetPs()
   * @see #getPs()
   * @see #setPs(int)
   * @generated
   */
  boolean isSetPs();

} // Specs
