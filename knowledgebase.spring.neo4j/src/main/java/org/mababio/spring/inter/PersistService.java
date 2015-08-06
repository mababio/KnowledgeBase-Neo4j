package org.mababio.spring.inter;

import java.util.Set;
import java.util.function.Predicate;

//import org.mababio.spring.managedbean.PersistBean;




public interface PersistService {
	
	public void merger(final Node consumer, final Node load);
	public void merger(final Node consumer, Set<? extends Node> load);
	public void persist(final Node node, Predicate<Node> ped);
	public void persist(final Node node);
	public void persistTest(final Node node);
	

}
