package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cathodicprotection.class)
public abstract class Cathodicprotection_ {

	public static volatile SetAttribute<Cathodicprotection, Plannedpreventivemaintenance> maintrance;
	public static volatile SetAttribute<Cathodicprotection, Cathodicconverter> cathodicprotection;
	public static volatile SingularAttribute<Cathodicprotection, String> name;
	public static volatile SetAttribute<Cathodicprotection, Expluatationcontrol> expcontrol;
	public static volatile SetAttribute<Cathodicprotection, Anodegrounding> anode;
	public static volatile SingularAttribute<Cathodicprotection, Integer> id;
	public static volatile SetAttribute<Cathodicprotection, Summaryinfo> summaryinfo;
	public static volatile SingularAttribute<Cathodicprotection, Integer> idPass;

}

