/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtuml.bp.xtext.masl.masl.structure.*;

import org.xtuml.bp.xtext.masl.masl.types.AbstractTypeDefinition;
import org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference;
import org.xtuml.bp.xtext.masl.masl.types.TypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage
 * @generated
 */
public class StructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StructurePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureSwitch<Adapter> modelSwitch =
		new StructureSwitch<Adapter>() {
			@Override
			public Adapter caseMaslModel(MaslModel object) {
				return createMaslModelAdapter();
			}
			@Override
			public Adapter caseAbstractNamed(AbstractNamed object) {
				return createAbstractNamedAdapter();
			}
			@Override
			public Adapter caseAbstractTopLevelElement(AbstractTopLevelElement object) {
				return createAbstractTopLevelElementAdapter();
			}
			@Override
			public Adapter caseAbstractFeature(AbstractFeature object) {
				return createAbstractFeatureAdapter();
			}
			@Override
			public Adapter caseParameterized(Parameterized object) {
				return createParameterizedAdapter();
			}
			@Override
			public Adapter caseVisualized(Visualized object) {
				return createVisualizedAdapter();
			}
			@Override
			public Adapter caseAbstractActionDeclaration(AbstractActionDeclaration object) {
				return createAbstractActionDeclarationAdapter();
			}
			@Override
			public Adapter caseAbstractActionDefinition(AbstractActionDefinition object) {
				return createAbstractActionDefinitionAdapter();
			}
			@Override
			public Adapter caseAbstractService(AbstractService object) {
				return createAbstractServiceAdapter();
			}
			@Override
			public Adapter casePragmatized(Pragmatized object) {
				return createPragmatizedAdapter();
			}
			@Override
			public Adapter casePragma(Pragma object) {
				return createPragmaAdapter();
			}
			@Override
			public Adapter casePragmaValue(PragmaValue object) {
				return createPragmaValueAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseProjectDefinition(ProjectDefinition object) {
				return createProjectDefinitionAdapter();
			}
			@Override
			public Adapter caseDomainDefinition(DomainDefinition object) {
				return createDomainDefinitionAdapter();
			}
			@Override
			public Adapter caseDomainServiceDeclaration(DomainServiceDeclaration object) {
				return createDomainServiceDeclarationAdapter();
			}
			@Override
			public Adapter caseDomainServiceDefinition(DomainServiceDefinition object) {
				return createDomainServiceDefinitionAdapter();
			}
			@Override
			public Adapter caseExceptionDeclaration(ExceptionDeclaration object) {
				return createExceptionDeclarationAdapter();
			}
			@Override
			public Adapter caseTerminatorDefinition(TerminatorDefinition object) {
				return createTerminatorDefinitionAdapter();
			}
			@Override
			public Adapter caseTerminatorServiceDeclaration(TerminatorServiceDeclaration object) {
				return createTerminatorServiceDeclarationAdapter();
			}
			@Override
			public Adapter caseTerminatorServiceDefinition(TerminatorServiceDefinition object) {
				return createTerminatorServiceDefinitionAdapter();
			}
			@Override
			public Adapter caseBuiltinLibraryDefinition(BuiltinLibraryDefinition object) {
				return createBuiltinLibraryDefinitionAdapter();
			}
			@Override
			public Adapter caseCharacteristic(Characteristic object) {
				return createCharacteristicAdapter();
			}
			@Override
			public Adapter caseTypeParameter(TypeParameter object) {
				return createTypeParameterAdapter();
			}
			@Override
			public Adapter caseRangeTypeReference(RangeTypeReference object) {
				return createRangeTypeReferenceAdapter();
			}
			@Override
			public Adapter caseObjectDeclaration(ObjectDeclaration object) {
				return createObjectDeclarationAdapter();
			}
			@Override
			public Adapter caseObjectDefinition(ObjectDefinition object) {
				return createObjectDefinitionAdapter();
			}
			@Override
			public Adapter caseAttributeDefinition(AttributeDefinition object) {
				return createAttributeDefinitionAdapter();
			}
			@Override
			public Adapter caseIdentifierDefinition(IdentifierDefinition object) {
				return createIdentifierDefinitionAdapter();
			}
			@Override
			public Adapter caseObjectServiceDeclaration(ObjectServiceDeclaration object) {
				return createObjectServiceDeclarationAdapter();
			}
			@Override
			public Adapter caseObjectServiceDefinition(ObjectServiceDefinition object) {
				return createObjectServiceDefinitionAdapter();
			}
			@Override
			public Adapter caseRelationshipDefinition(RelationshipDefinition object) {
				return createRelationshipDefinitionAdapter();
			}
			@Override
			public Adapter caseRegularRelationshipDefinition(RegularRelationshipDefinition object) {
				return createRegularRelationshipDefinitionAdapter();
			}
			@Override
			public Adapter caseAssocRelationshipDefinition(AssocRelationshipDefinition object) {
				return createAssocRelationshipDefinitionAdapter();
			}
			@Override
			public Adapter caseRelationshipEnd(RelationshipEnd object) {
				return createRelationshipEndAdapter();
			}
			@Override
			public Adapter caseSubtypeRelationshipDefinition(SubtypeRelationshipDefinition object) {
				return createSubtypeRelationshipDefinitionAdapter();
			}
			@Override
			public Adapter caseRelationshipNavigation(RelationshipNavigation object) {
				return createRelationshipNavigationAdapter();
			}
			@Override
			public Adapter caseObjectOrRole(ObjectOrRole object) {
				return createObjectOrRoleAdapter();
			}
			@Override
			public Adapter caseEventDefinition(EventDefinition object) {
				return createEventDefinitionAdapter();
			}
			@Override
			public Adapter caseStateDeclaration(StateDeclaration object) {
				return createStateDeclarationAdapter();
			}
			@Override
			public Adapter caseStateDefinition(StateDefinition object) {
				return createStateDefinitionAdapter();
			}
			@Override
			public Adapter caseTransitionTable(TransitionTable object) {
				return createTransitionTableAdapter();
			}
			@Override
			public Adapter caseTransitionRow(TransitionRow object) {
				return createTransitionRowAdapter();
			}
			@Override
			public Adapter caseTransitionOption(TransitionOption object) {
				return createTransitionOptionAdapter();
			}
			@Override
			public Adapter caseTypeDeclaration(TypeDeclaration object) {
				return createTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseAbstractTypeDefinition(AbstractTypeDefinition object) {
				return createAbstractTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseAbstractTypeReference(AbstractTypeReference object) {
				return createAbstractTypeReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.MaslModel <em>Masl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.MaslModel
	 * @generated
	 */
	public Adapter createMaslModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractNamed <em>Abstract Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AbstractNamed
	 * @generated
	 */
	public Adapter createAbstractNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractTopLevelElement <em>Abstract Top Level Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AbstractTopLevelElement
	 * @generated
	 */
	public Adapter createAbstractTopLevelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractFeature <em>Abstract Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AbstractFeature
	 * @generated
	 */
	public Adapter createAbstractFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.Parameterized <em>Parameterized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Parameterized
	 * @generated
	 */
	public Adapter createParameterizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.Visualized <em>Visualized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Visualized
	 * @generated
	 */
	public Adapter createVisualizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractActionDeclaration <em>Abstract Action Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AbstractActionDeclaration
	 * @generated
	 */
	public Adapter createAbstractActionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractActionDefinition <em>Abstract Action Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AbstractActionDefinition
	 * @generated
	 */
	public Adapter createAbstractActionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractService <em>Abstract Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AbstractService
	 * @generated
	 */
	public Adapter createAbstractServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.Pragmatized <em>Pragmatized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Pragmatized
	 * @generated
	 */
	public Adapter createPragmatizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.Pragma <em>Pragma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Pragma
	 * @generated
	 */
	public Adapter createPragmaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.PragmaValue <em>Pragma Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.PragmaValue
	 * @generated
	 */
	public Adapter createPragmaValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.ProjectDefinition <em>Project Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.ProjectDefinition
	 * @generated
	 */
	public Adapter createProjectDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.DomainDefinition <em>Domain Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.DomainDefinition
	 * @generated
	 */
	public Adapter createDomainDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.DomainServiceDeclaration <em>Domain Service Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.DomainServiceDeclaration
	 * @generated
	 */
	public Adapter createDomainServiceDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.DomainServiceDefinition <em>Domain Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.DomainServiceDefinition
	 * @generated
	 */
	public Adapter createDomainServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.ExceptionDeclaration <em>Exception Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.ExceptionDeclaration
	 * @generated
	 */
	public Adapter createExceptionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorDefinition <em>Terminator Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.TerminatorDefinition
	 * @generated
	 */
	public Adapter createTerminatorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDeclaration <em>Terminator Service Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDeclaration
	 * @generated
	 */
	public Adapter createTerminatorServiceDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition <em>Terminator Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition
	 * @generated
	 */
	public Adapter createTerminatorServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.BuiltinLibraryDefinition <em>Builtin Library Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.BuiltinLibraryDefinition
	 * @generated
	 */
	public Adapter createBuiltinLibraryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Characteristic
	 * @generated
	 */
	public Adapter createCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.TypeParameter
	 * @generated
	 */
	public Adapter createTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.RangeTypeReference <em>Range Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.RangeTypeReference
	 * @generated
	 */
	public Adapter createRangeTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectDeclaration <em>Object Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.ObjectDeclaration
	 * @generated
	 */
	public Adapter createObjectDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectDefinition <em>Object Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.ObjectDefinition
	 * @generated
	 */
	public Adapter createObjectDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AttributeDefinition
	 * @generated
	 */
	public Adapter createAttributeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.IdentifierDefinition <em>Identifier Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.IdentifierDefinition
	 * @generated
	 */
	public Adapter createIdentifierDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectServiceDeclaration <em>Object Service Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.ObjectServiceDeclaration
	 * @generated
	 */
	public Adapter createObjectServiceDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectServiceDefinition <em>Object Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.ObjectServiceDefinition
	 * @generated
	 */
	public Adapter createObjectServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.RelationshipDefinition <em>Relationship Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.RelationshipDefinition
	 * @generated
	 */
	public Adapter createRelationshipDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.RegularRelationshipDefinition <em>Regular Relationship Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.RegularRelationshipDefinition
	 * @generated
	 */
	public Adapter createRegularRelationshipDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AssocRelationshipDefinition <em>Assoc Relationship Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AssocRelationshipDefinition
	 * @generated
	 */
	public Adapter createAssocRelationshipDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.RelationshipEnd <em>Relationship End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.RelationshipEnd
	 * @generated
	 */
	public Adapter createRelationshipEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.SubtypeRelationshipDefinition <em>Subtype Relationship Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.SubtypeRelationshipDefinition
	 * @generated
	 */
	public Adapter createSubtypeRelationshipDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation <em>Relationship Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation
	 * @generated
	 */
	public Adapter createRelationshipNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectOrRole <em>Object Or Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.ObjectOrRole
	 * @generated
	 */
	public Adapter createObjectOrRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.EventDefinition
	 * @generated
	 */
	public Adapter createEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.StateDeclaration <em>State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StateDeclaration
	 * @generated
	 */
	public Adapter createStateDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.StateDefinition <em>State Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StateDefinition
	 * @generated
	 */
	public Adapter createStateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.TransitionTable <em>Transition Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.TransitionTable
	 * @generated
	 */
	public Adapter createTransitionTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.TransitionRow <em>Transition Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.TransitionRow
	 * @generated
	 */
	public Adapter createTransitionRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.TransitionOption <em>Transition Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.TransitionOption
	 * @generated
	 */
	public Adapter createTransitionOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypeDeclaration
	 * @generated
	 */
	public Adapter createTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.AbstractTypeDefinition <em>Abstract Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.AbstractTypeDefinition
	 * @generated
	 */
	public Adapter createAbstractTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference <em>Abstract Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference
	 * @generated
	 */
	public Adapter createAbstractTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StructureAdapterFactory
