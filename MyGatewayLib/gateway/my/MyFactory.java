/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gateway.my.MyPackage
 * @generated
 */
public interface MyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyFactory eINSTANCE = gateway.my.impl.MyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Car</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Car</em>'.
   * @generated
   */
  Car createCar();

  /**
   * Returns a new object of class '<em>Cars</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cars</em>'.
   * @generated
   */
  Cars createCars();

  /**
   * Returns a new object of class '<em>Specs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specs</em>'.
   * @generated
   */
  Specs createSpecs();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyPackage getMyPackage();

} //MyFactory
