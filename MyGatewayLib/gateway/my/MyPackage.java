/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gateway.my.MyFactory
 * @model kind="package"
 * @generated
 */
public interface MyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "my";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://MyGateway";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "my";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyPackage eINSTANCE = gateway.my.impl.MyPackageImpl.init();

  /**
   * The meta object id for the '{@link gateway.my.impl.CarImpl <em>Car</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gateway.my.impl.CarImpl
   * @see gateway.my.impl.MyPackageImpl#getCar()
   * @generated
   */
  int CAR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__NAME = 1;

  /**
   * The feature id for the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__MODEL = 2;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__YEAR = 3;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__PRICE = 4;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__SPEC = 5;

  /**
   * The number of structural features of the '<em>Car</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link gateway.my.impl.CarsImpl <em>Cars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gateway.my.impl.CarsImpl
   * @see gateway.my.impl.MyPackageImpl#getCars()
   * @generated
   */
  int CARS = 1;

  /**
   * The feature id for the '<em><b>Car</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARS__CAR = 0;

  /**
   * The number of structural features of the '<em>Cars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gateway.my.impl.SpecsImpl <em>Specs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gateway.my.impl.SpecsImpl
   * @see gateway.my.impl.MyPackageImpl#getSpecs()
   * @generated
   */
  int SPECS = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECS__ID = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECS__COLOR = 1;

  /**
   * The feature id for the '<em><b>Mph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECS__MPH = 2;

  /**
   * The feature id for the '<em><b>Ps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECS__PS = 3;

  /**
   * The number of structural features of the '<em>Specs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECS_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link gateway.my.Car <em>Car</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Car</em>'.
   * @see gateway.my.Car
   * @generated
   */
  EClass getCar();

  /**
   * Returns the meta object for the attribute '{@link gateway.my.Car#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see gateway.my.Car#getId()
   * @see #getCar()
   * @generated
   */
  EAttribute getCar_Id();

  /**
   * Returns the meta object for the attribute '{@link gateway.my.Car#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gateway.my.Car#getName()
   * @see #getCar()
   * @generated
   */
  EAttribute getCar_Name();

  /**
   * Returns the meta object for the attribute '{@link gateway.my.Car#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model</em>'.
   * @see gateway.my.Car#getModel()
   * @see #getCar()
   * @generated
   */
  EAttribute getCar_Model();

  /**
   * Returns the meta object for the attribute '{@link gateway.my.Car#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see gateway.my.Car#getYear()
   * @see #getCar()
   * @generated
   */
  EAttribute getCar_Year();

  /**
   * Returns the meta object for the attribute '{@link gateway.my.Car#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see gateway.my.Car#getPrice()
   * @see #getCar()
   * @generated
   */
  EAttribute getCar_Price();

  /**
   * Returns the meta object for the containment reference '{@link gateway.my.Car#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see gateway.my.Car#getSpec()
   * @see #getCar()
   * @generated
   */
  EReference getCar_Spec();

  /**
   * Returns the meta object for class '{@link gateway.my.Cars <em>Cars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cars</em>'.
   * @see gateway.my.Cars
   * @generated
   */
  EClass getCars();

  /**
   * Returns the meta object for the containment reference list '{@link gateway.my.Cars#getCar <em>Car</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Car</em>'.
   * @see gateway.my.Cars#getCar()
   * @see #getCars()
   * @generated
   */
  EReference getCars_Car();

  /**
   * Returns the meta object for class '{@link gateway.my.Specs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specs</em>'.
   * @see gateway.my.Specs
   * @generated
   */
  EClass getSpecs();

  /**
   * Returns the meta object for the attribute '{@link gateway.my.Specs#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see gateway.my.Specs#getId()
   * @see #getSpecs()
   * @generated
   */
  EAttribute getSpecs_Id();

  /**
   * Returns the meta object for the attribute '{@link gateway.my.Specs#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see gateway.my.Specs#getColor()
   * @see #getSpecs()
   * @generated
   */
  EAttribute getSpecs_Color();

  /**
   * Returns the meta object for the attribute '{@link gateway.my.Specs#getMph <em>Mph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mph</em>'.
   * @see gateway.my.Specs#getMph()
   * @see #getSpecs()
   * @generated
   */
  EAttribute getSpecs_Mph();

  /**
   * Returns the meta object for the attribute '{@link gateway.my.Specs#getPs <em>Ps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ps</em>'.
   * @see gateway.my.Specs#getPs()
   * @see #getSpecs()
   * @generated
   */
  EAttribute getSpecs_Ps();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyFactory getMyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link gateway.my.impl.CarImpl <em>Car</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gateway.my.impl.CarImpl
     * @see gateway.my.impl.MyPackageImpl#getCar()
     * @generated
     */
    EClass CAR = eINSTANCE.getCar();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAR__ID = eINSTANCE.getCar_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAR__NAME = eINSTANCE.getCar_Name();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAR__MODEL = eINSTANCE.getCar_Model();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAR__YEAR = eINSTANCE.getCar_Year();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAR__PRICE = eINSTANCE.getCar_Price();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAR__SPEC = eINSTANCE.getCar_Spec();

    /**
     * The meta object literal for the '{@link gateway.my.impl.CarsImpl <em>Cars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gateway.my.impl.CarsImpl
     * @see gateway.my.impl.MyPackageImpl#getCars()
     * @generated
     */
    EClass CARS = eINSTANCE.getCars();

    /**
     * The meta object literal for the '<em><b>Car</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARS__CAR = eINSTANCE.getCars_Car();

    /**
     * The meta object literal for the '{@link gateway.my.impl.SpecsImpl <em>Specs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gateway.my.impl.SpecsImpl
     * @see gateway.my.impl.MyPackageImpl#getSpecs()
     * @generated
     */
    EClass SPECS = eINSTANCE.getSpecs();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECS__ID = eINSTANCE.getSpecs_Id();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECS__COLOR = eINSTANCE.getSpecs_Color();

    /**
     * The meta object literal for the '<em><b>Mph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECS__MPH = eINSTANCE.getSpecs_Mph();

    /**
     * The meta object literal for the '<em><b>Ps</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECS__PS = eINSTANCE.getSpecs_Ps();

  }

} //MyPackage
