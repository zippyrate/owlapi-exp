package exp.owlapi;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.parameters.Imports;

public class OWLAPIExp
{
  public static void main(String[] args)
  {
    try {
      // Create an empty OWL ontology using the OWLAPI
      OWLOntologyManager ontologyManager = OWLManager.createOWLOntologyManager();
      OWLOntology ontology = ontologyManager
        .loadOntologyFromOntologyDocument(OWLAPIExp.class.getResourceAsStream("/InvalidVariable.owl"));

      for (SWRLRule swrlRule : ontology.getAxioms(AxiomType.SWRL_RULE, Imports.INCLUDED)) {
        for (SWRLAtom swrlAtom: swrlRule.getBody())
          System.out.println("Body SWRLAtom: " + swrlAtom);
        for (SWRLAtom swrlAtom: swrlRule.getHead())
          System.out.println("Head SWRLAtom: " + swrlAtom);

      }
    } catch (OWLOntologyCreationException e) {
      System.err.println("Error creating OWL ontology: " + e.getMessage());
      System.exit(-1);
    } catch (RuntimeException e) {
      System.err.println("Error starting application: " + e.getMessage());
      System.exit(-1);
    }
  }
}
