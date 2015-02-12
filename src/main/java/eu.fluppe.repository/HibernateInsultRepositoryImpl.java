package eu.fluppe.repository;

import java.util.ArrayList;
import java.util.List;
import eu.fluppe.model.Insult;
import org.springframework.stereotype.Repository;

@Repository("insultRepository")
public class HibernateInsultRepositoryImpl implements InsultRepository {
	public List<Insult> findAll() {
		List<Insult> insults = new ArrayList<Insult>();

		Insult insult = new Insult();
		insult.setInsultString("Ge zijt lelijk");

		insults.add(insult);

		return insults;
	}

}