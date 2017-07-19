/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gateway.my.Cars#getCar <em>Car</em>}</li>
 * </ul>
 * </p>
 *
 * @see gateway.my.MyPackage#getCars()
 * @model extendedMetaData="name='Cars' kind='elementOnly'"
 * @generated
 */
public interface Cars
{
  /**
   * Returns the value of the '<em><b>Car</b></em>' containment reference list.
   * The list contents are of type {@link gateway.my.Car}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Car</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Car</em>' containment reference list.
   * @see gateway.my.MyPackage#getCars_Car()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='car'"
   * @generated
   */
  List<Car> getCar();

} // Cars
