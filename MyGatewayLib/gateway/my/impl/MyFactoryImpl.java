/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my.impl;

import gateway.my.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyFactoryImpl extends EFactoryImpl implements MyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyFactory init()
  {
    try
    {
      MyFactory theMyFactory = (MyFactory)EPackage.Registry.INSTANCE.getEFactory("http://MyGateway"); 
      if (theMyFactory != null)
      {
        return theMyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyPackage.CAR: return (EObject)createCar();
      case MyPackage.CARS: return (EObject)createCars();
      case MyPackage.SPECS: return (EObject)createSpecs();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Car createCar()
  {
    CarImpl car = new CarImpl();
    return car;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cars createCars()
  {
    CarsImpl cars = new CarsImpl();
    return cars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specs createSpecs()
  {
    SpecsImpl specs = new SpecsImpl();
    return specs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyPackage getMyPackage()
  {
    return (MyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyPackage getPackage()
  {
    return MyPackage.eINSTANCE;
  }

} //MyFactoryImpl
