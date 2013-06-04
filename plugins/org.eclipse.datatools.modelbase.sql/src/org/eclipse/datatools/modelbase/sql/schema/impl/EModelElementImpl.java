/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.schema.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EModel Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.EModelElementImpl#getEAnnotations <em>EAnnotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EModelElementImpl extends CDOObjectImpl implements EModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EModelElementImpl() {
		super();
	}

	/**
	 * The bit of {@link #eFlags} that is used to represent being {@link #freeze() frozen}.
	 */
	protected static final int EFROZEN = ELAST_EOBJECT_FLAG << 1;
	
	  protected void freeze()
	  {
	    setFrozen();
	  }

	  protected void freeze(Object eModelElement)
	  {
	    if (eModelElement instanceof EModelElementImpl)
	    { 
	      ((EModelElementImpl)eModelElement).freeze();
	    }
	  }

	  protected void setFrozen()
	  {
	    eFlags |= EFROZEN;
	  }

	  protected boolean isFrozen()
	  {
	    return (eFlags & EFROZEN) != 0;
	  }
	  
	  private static final String [] ESCAPE =
	  {
	    "%00",
	    "%01",
	    "%02",
	    "%03",
	    "%04",
	    "%05",
	    "%06",
	    "%07",
	    "%08",
	    "%09",
	    "%0A",
	    "%0B",
	    "%0C",
	    "%0D",
	    "%0E",
	    "%0F",
	    "%10",
	    "%11",
	    "%12",
	    "%13",
	    "%14",
	    "%15",
	    "%16",
	    "%17",
	    "%18",
	    "%19",
	    "%1A",
	    "%1B",
	    "%1C",
	    "%1D",
	    "%1E",
	    "%1F",
	    "%20",
	    null,
	    "%22",
	    "%23",
	    null,
	    "%25",
	    "%26",
	    "%27",
	    null,
	    null,
	    null,
	    null,
	    "%2C",
	    null,
	    null,
	    "%2F",
	    null,
	    null,
	    null,
	    null,
	    null,
	    null,
	    null,
	    null,
	    null,
	    null,
	    "%3A",
	    null,
	    "%3C",
	    null,
	    "%3E",
	    null,
	  };	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EMODEL_ELEMENT;
	}
	
	  /**
	   * Returns the encoded value or the original, if no encoding was needed.
	   * @see EModelElementImpl#eURIFragmentSegment(EStructuralFeature, EObject)
	   * @param value the value to be encoded.
	   * @return the encoded value or the original, if no encoding was needed.
	   */
	  static String eEncodeValue(String value)
	  {
	    int length = value.length();
	    StringBuilder result = null;
	    for (int i = 0; i < length; ++i)
	    {
	      char character = value.charAt(i);
	      if (character < ESCAPE.length)
	      {
	        String escape = ESCAPE[character];
	        if (escape != null)
	        {
	          if (result == null)
	          {
	            result = new StringBuilder(length + 2);
	            result.append(value, 0, i);
	          }
	          result.append(escape);
	          continue;
	        }
	      }
	      if (result != null)
	      {
	        result.append(character);
	      }
	    }
	    return result == null ? value : result.toString();
	  }	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EAnnotation> getEAnnotations() {
		return (EList<EAnnotation>)eGet(EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EAnnotation getEAnnotation(String source) {

		if (getEAnnotations() != null)
	    {
	      if (getEAnnotations() instanceof BasicEList)
	      {
	        int size = getEAnnotations().size();
	        if (size > 0)
	        {
	          EAnnotation [] eAnnotationArray = (EAnnotation[])((BasicEList<?>)getEAnnotations()).data();
	          if (source == null)
	          {
	            for (int i = 0; i < size; ++i)
	            {
	              EAnnotation eAnnotation = eAnnotationArray[i];
	              if (eAnnotation.getSource() == null)
	              {
	                return eAnnotation;
	              }
	            }
	          }
	          else
	          {
	            for (int i = 0; i < size; ++i)
	            {
	              EAnnotation eAnnotation = eAnnotationArray[i];
	              if (source.equals(eAnnotation.getSource()))
	              {
	                return eAnnotation;
	              }
	            }
	          }
	        }
	      }
	      else
	      {
	        if (source == null)
	        {
	          for (EAnnotation eAnnotation : getEAnnotations())
	          {
	            if (eAnnotation.getSource() == null)
	            {
	              return eAnnotation;
	            }
	          }
	        }
	        else
	        {
	          for (EAnnotation eAnnotation : getEAnnotations())
	          {
	            if (source.equals(eAnnotation.getSource()))
	            {
	              return eAnnotation;
	            }
	          }
	        }
	      }
	    }

	    return null;
	}
	
	  @Override
	  public String eURIFragmentSegment(EStructuralFeature eStructuralFeature, EObject eObject)
	  {
	    if (eObject instanceof ENamedElement)
	    {
	      ENamedElement eNamedElement = (ENamedElement)eObject;
	      String name = eNamedElement.getName();
	      if (name != null)
	      {
	        int count = 0;
	        for (Object otherEObject : eContents())
	        {
	          if (otherEObject == eObject)
	          {
	            break;
	          }
	          if (otherEObject instanceof ENamedElement)
	          {
	            ENamedElement otherENamedElement = (ENamedElement)otherEObject;
	            if (name.equals(otherENamedElement.getName()))
	            {
	              ++count;
	            }
	          }
	        }
	        name = eEncodeValue(name);
	        return 
	          count > 0 ?
	            name + "." + count : 
	            name;
	      }
	    }
	    else if (eObject instanceof EAnnotation)
	    {
	      EAnnotation eAnnotation = (EAnnotation)eObject;
	      String source = eAnnotation.getSource();
	      if (source != null)
	      {
	        int count = 0;
	        for (Object otherEObject : eContents())
	        {
	          if (otherEObject == eObject)
	          {
	            break;
	          }
	          if (otherEObject instanceof EAnnotation)
	          {
	            EAnnotation otherEAnnotation = (EAnnotation)otherEObject;
	            if (source.equals(otherEAnnotation.getSource()))
	            {
	              ++count;
	            }
	          }
	        }
	        
	        StringBuffer result = new StringBuffer(source.length() + 5);
	        result.append('%');
	        result.append(URI.encodeSegment(source,  false));
	        result.append('%');
	        if (count > 0)
	        {
	          result.append('.');
	          result.append(count);
	        }
	        return result.toString();
	      }
	    }
	    return super.eURIFragmentSegment(eStructuralFeature, eObject);
	  }
	  
	  @Override
	  public EObject eObjectForURIFragmentSegment(String uriFragmentSegment)
	  {
	    int length = uriFragmentSegment.length();
	    if (length > 0)
	    {
	      // Is the first character a special character, i.e., something other than '@'?
	      //
	      char firstCharacter = uriFragmentSegment.charAt(0);
	      if (firstCharacter != '@')
	      {
	        // Is it the start of a source URI of an annotation?
	        //
	        if (firstCharacter == '%')
	        {
	          // Find the closing '%'
	          //
	          int index = uriFragmentSegment.lastIndexOf("%");
	          boolean hasCount = false;
	          if (index == length - 1 || (hasCount = uriFragmentSegment.charAt(index + 1) == '.'))
	          {
	            // Decode all encoded characters.
	            //
	            String source = URI.decode(uriFragmentSegment.substring(1, index));
	            
	            // Check for a count, i.e., a '.' followed by a number.
	            //
	            int count = 0;
	            if (hasCount)
	            {
	              try
	              {
	                count = Integer.parseInt(uriFragmentSegment.substring(index + 2));
	              }
	              catch (NumberFormatException exception)
	              {
	                throw new WrappedException(exception);
	              }
	            }
	            
	            // Look for the annotation with the matching source.
	            //
	            for (Object object : eContents())
	            {
	              if (object instanceof EAnnotation)
	              {
	                EAnnotation eAnnotation = (EAnnotation)object;
	                if (source.equals(eAnnotation.getSource()) && count-- == 0)
	                {
	                  return eAnnotation;
	                }
	              }
	            }
	            return null;
	          }
	        }

	        // Look for trailing count.
	        //
	        int index = uriFragmentSegment.lastIndexOf(".");
	        String name = index == -1 ? uriFragmentSegment : uriFragmentSegment.substring(0, index);
	        int count = 0;
	        if (index != -1)
	        {
	          try
	          {
	            count = Integer.parseInt(uriFragmentSegment.substring(index + 1));
	          }
	          catch (NumberFormatException exception)
	          {
	            // Interpret it as part of the name.
	            //
	            name = uriFragmentSegment;
	          }
	        }

	        name = URI.decode(name);
	    
	        // Look for a matching named element.
	        //
	        for (Object object : eContents())
	        {
	          if (object instanceof ENamedElement)
	          {
	            ENamedElement eNamedElement = (ENamedElement)object;
	            if (name.equals(eNamedElement.getName()) && count-- == 0)
	            {
	              return eNamedElement;
	            }
	          }
	        }
	  
	        return null;
	      }
	    }
	    
	    return super.eObjectForURIFragmentSegment(uriFragmentSegment);
	  }
	  
	  
	  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcorePackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING:
				return getEAnnotation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EModelElementImpl
