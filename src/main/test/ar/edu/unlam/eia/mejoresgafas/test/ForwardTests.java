package ar.edu.unlam.eia.mejoresgafas.test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import ar.edu.unlam.eia.mejoresgafas.model.Cabello;
import ar.edu.unlam.eia.mejoresgafas.model.ColorMarco;
import ar.edu.unlam.eia.mejoresgafas.model.Expresion;
import ar.edu.unlam.eia.mejoresgafas.model.FormaMarco;
import ar.edu.unlam.eia.mejoresgafas.model.Frente;
import ar.edu.unlam.eia.mejoresgafas.model.Mandibula;
import ar.edu.unlam.eia.mejoresgafas.model.Mejillas;
import ar.edu.unlam.eia.mejoresgafas.model.Menton;
import ar.edu.unlam.eia.mejoresgafas.model.Piel;
import ar.edu.unlam.eia.mejoresgafas.model.Pomulos;
import ar.edu.unlam.eia.mejoresgafas.model.Rasgos;
import ar.edu.unlam.eia.mejoresgafas.model.Rostro;
import ar.edu.unlam.eia.mejoresgafas.utils.KnowledgeSessionHelper;

public class ForwardTests {

	String K_SESSION_NAME = "ksession-forward-rules";
	
	KieSession sessionStatefull;
	static KieContainer kieContainer;

	FactHandle rostroDir;
	
	public ForwardTests() {
		
	}
		
	@BeforeClass
	public static void beforeallTestSetup() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}

	private void prepareKnowledgeSession() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSessionWithCallback(kieContainer, K_SESSION_NAME);
		//sessionStatefull.addEventListener(buildEventListener());
	}
	
	@Before
	public void setUp() {
		System.out.println();
		System.out.println("----------Start----------");
		System.out.println();
		this.prepareKnowledgeSession();
	}

	@After
	public void tearDown() {
		System.out.println();
		System.out.println("----------End----------");
		System.out.println();
	}
	
	@Test
	public void rostroOvaladoTest() {
		System.out.println("Caso de prueba nro 1: rostro ovalado");
		Rostro rostro = new Rostro();
		rostro.setMenton(Menton.Fino);
		rostro.setMejillas(Mejillas.Anchas);
		rostro.setFrente(Frente.Estrecha);
		System.out.println(rostro.toString());
		//FactHandle rostroDir = sessionStatefull.insert(rostro);
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		//rostro = (Rostro) sessionStatefull.getObject(rostroDir);
		assert(rostro.getGafas().getFormaMarco().toString().equals(FormaMarco.Cualquiera.toString()));
	}
	
	@Test
	public void rostroAlargadoTest() {
		System.out.println("Caso de prueba nro 2: rostro alargado");
		Rostro rostro = new Rostro();
		rostro.setFrente(Frente.Estrecha);
		rostro.setMejillas(Mejillas.Estrechas);
		rostro.setMenton(Menton.Fino);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getFormaMarco().toString().equals(FormaMarco.Anchas.toString()));
	}

	@Test
	public void rostroTriangularTest() {
		System.out.println("Caso de prueba nro 3: rostro triangular");
		Rostro rostro = new Rostro();
		rostro.setFrente(Frente.Estrecha);
		rostro.setMenton(Menton.Pronunciado);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getFormaMarco().toString().equals(FormaMarco.Alargadas.toString()));
	}
	
	@Test
	public void rostroCorazonTest() {
		System.out.println("Caso de prueba nro 4: rostro corazón");
		Rostro rostro = new Rostro();
		rostro.setFrente(Frente.Ancha);
		rostro.setMejillas(Mejillas.Anchas);
		rostro.setMenton(Menton.Pequeño);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getFormaMarco().toString().equals(FormaMarco.Rectangulares.toString()));
	}
	
	@Test
	public void rostroCuadradoTest() {
		System.out.println("Caso de prueba nro 5: rostro cuadrado");
		Rostro rostro = new Rostro();
		rostro.setFrente(Frente.Amplia);
		rostro.setPomulos(Pomulos.Amplios);
		rostro.setMandibula(Mandibula.Ancha);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getFormaMarco().toString().equals(FormaMarco.Ovaladas.toString()));
	}
	
	@Test
	public void rostroRedondoTest() {
		System.out.println("Caso de prueba nro 6: rostro redondo");
		Rostro rostro = new Rostro();
		rostro.setRasgos(Rasgos.NoMarcados);
		rostro.setMenton(Menton.Corto);
		rostro.setExpresion(Expresion.Dulce);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getFormaMarco().toString().equals(FormaMarco.Angulosas.toString()));
	}
	
	@Test
	public void pielClaraTest() {
		System.out.println("Caso de prueba nro 7: piel clara");
		Rostro rostro = new Rostro();
		rostro.setPiel(Piel.Clara);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getColorMarco().toString().equals(ColorMarco.MetalicoPlataOEstañoOPastaFrio.toString()));
	}
	
	@Test
	public void pielOscuraTest() {
		System.out.println("Caso de prueba nro 8: piel oscura");
		Rostro rostro = new Rostro();
		rostro.setPiel(Piel.Oscura);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getColorMarco().toString().equals(ColorMarco.MetalicoDoradoOBronceOPastaCalido.toString()));
	}
	
	@Test
	public void cabelloClaroTest() {
		System.out.println("Caso de prueba nro 9: cabello claro");
		Rostro rostro = new Rostro();
		rostro.setCabello(Cabello.Claro);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getColorMarco().toString().equals(ColorMarco.SuavesYPastel.toString()));
	}
	
	@Test
	public void cabelloRojizoTest() {
		System.out.println("Caso de prueba nro 10: cabello rojizo");
		Rostro rostro = new Rostro();
		rostro.setCabello(Cabello.Rojizo);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getColorMarco().toString().equals(ColorMarco.GranateOMarronCobrizo.toString()));
	}
	
	@Test
	public void cabelloOscuroTest() {
		System.out.println("Caso de prueba nro 11: cabello oscuro");
		Rostro rostro = new Rostro();
		rostro.setCabello(Cabello.Oscuro);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getColorMarco().toString().equals(ColorMarco.OscurosEIntensos.toString()));
	}

	@Test
	public void cabelloCanosoTest() {
		System.out.println("Caso de prueba nro 12: cabello canoso");
		Rostro rostro = new Rostro();
		rostro.setCabello(Cabello.Canoso);
		System.out.println(rostro.toString());
		sessionStatefull.insert(rostro);
		sessionStatefull.fireAllRules();
		System.out.println(rostro.getGafas().toString());
		assert(rostro.getGafas().getColorMarco().toString().equals(ColorMarco.GrisYLilaClaro.toString()));
	}
	
	@SuppressWarnings("unused")
	private RuleRuntimeEventListener buildEventListener() {
		return new RuleRuntimeEventListener() {
			@Override
			public void objectUpdated(ObjectUpdatedEvent event) {		
				System.out.println("Object updated \n" + event.getObject().toString());
			}

			@Override
			public void objectInserted(ObjectInsertedEvent event) {
				System.out.println("Object inserted \n" + event.getObject().toString());
			}

			@Override
			public void objectDeleted(ObjectDeletedEvent event) {
				System.out.println("Object deleted \n" + event.getOldObject().toString());
			}
		};
	}
	
}
