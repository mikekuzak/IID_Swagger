/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my.impl;

import gateway.my.Car;
import gateway.my.Cars;
import gateway.my.MyFactory;
import gateway.my.MyPackage;
import gateway.my.Specs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyPackageImpl extends EPackageImpl implements MyPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass carEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass carsEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specsEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see gateway.my.MyPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyPackageImpl()
  {
    super(eNS_URI, MyFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MyPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyPackage init()
  {
    if (isInited) return (MyPackage)EPackage.Registry.INSTANCE.getEPackage(MyPackage.eNS_URI);

    // Obtain or create and register package
    MyPackageImpl theMyPackage = (MyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theMyPackage.createPackageContents();

    // Initialize created meta-data
    theMyPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyPackage.eNS_URI, theMyPackage);
    return theMyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCar()
  {
    return carEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCar_Id()
  {
    return (EAttribute)carEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCar_Name()
  {
    return (EAttribute)carEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCar_Model()
  {
    return (EAttribute)carEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCar_Year()
  {
    return (EAttribute)carEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCar_Price()
  {
    return (EAttribute)carEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCar_Spec()
  {
    return (EReference)carEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCars()
  {
    return carsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCars_Car()
  {
    return (EReference)carsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecs()
  {
    return specsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecs_Id()
  {
    return (EAttribute)specsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecs_Color()
  {
    return (EAttribute)specsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecs_Mph()
  {
    return (EAttribute)specsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecs_Ps()
  {
    return (EAttribute)specsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyFactory getMyFactory()
  {
    return (MyFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    carEClass = createEClass(CAR);
    createEAttribute(carEClass, CAR__ID);
    createEAttribute(carEClass, CAR__NAME);
    createEAttribute(carEClass, CAR__MODEL);
    createEAttribute(carEClass, CAR__YEAR);
    createEAttribute(carEClass, CAR__PRICE);
    createEReference(carEClass, CAR__SPEC);

    carsEClass = createEClass(CARS);
    createEReference(carsEClass, CARS__CAR);

    specsEClass = createEClass(SPECS);
    createEAttribute(specsEClass, SPECS__ID);
    createEAttribute(specsEClass, SPECS__COLOR);
    createEAttribute(specsEClass, SPECS__MPH);
    createEAttribute(specsEClass, SPECS__PS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(carEClass, Car.class, "Car", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCar_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCar_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCar_Model(), theXMLTypePackage.getString(), "model", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCar_Year(), theXMLTypePackage.getString(), "year", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCar_Price(), theXMLTypePackage.getInt(), "price", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCar_Spec(), this.getSpecs(), null, "spec", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(carsEClass, Cars.class, "Cars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCars_Car(), this.getCar(), null, "car", null, 0, -1, Cars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specsEClass, Specs.class, "Specs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecs_Id(), theXMLTypePackage.getInt(), "id", null, 0, 1, Specs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpecs_Color(), theXMLTypePackage.getString(), "color", null, 0, 1, Specs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpecs_Mph(), theXMLTypePackage.getInt(), "mph", null, 0, 1, Specs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpecs_Ps(), theXMLTypePackage.getInt(), "ps", null, 0, 1, Specs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
    addAnnotation
      (carEClass, 
       source, 
       new String[] 
       {
       "name", "Car",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getCar_Id(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "id"
       });		
    addAnnotation
      (getCar_Name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "name"
       });		
    addAnnotation
      (getCar_Model(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "model"
       });		
    addAnnotation
      (getCar_Year(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "year"
       });		
    addAnnotation
      (getCar_Price(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "price"
       });		
    addAnnotation
      (getCar_Spec(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "spec"
       });		
    addAnnotation
      (carsEClass, 
       source, 
       new String[] 
       {
       "name", "Cars",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getCars_Car(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "car"
       });		
    addAnnotation
      (specsEClass, 
       source, 
       new String[] 
       {
       "name", "Specs",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getSpecs_Id(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "id"
       });		
    addAnnotation
      (getSpecs_Color(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "color"
       });		
    addAnnotation
      (getSpecs_Mph(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "mph"
       });		
    addAnnotation
      (getSpecs_Ps(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ps"
       });
  }

} //MyPackageImpl
