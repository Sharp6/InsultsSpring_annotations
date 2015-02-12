package eu.fluppe.services;

import java.util.List;
import eu.fluppe.repository.InsultRepository;
import eu.fluppe.model.Insult;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("insultService")
public class InsultServiceImpl implements InsultService {

	@Autowired
	private InsultRepository insultRepository;

	public List<Insult> findAll() {
		return insultRepository.findAll();
	}

	public void setInsultRepository(InsultRepository insultRepository) {
		this.insultRepository = insultRepository;
	}
}