package eu.fluppe.repository;

import eu.fluppe.model.Insult;
import java.util.List;

public interface InsultRepository {
	public List<Insult> findAll();
}