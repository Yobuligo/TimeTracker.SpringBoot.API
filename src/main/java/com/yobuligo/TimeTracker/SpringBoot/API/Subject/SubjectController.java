package com.yobuligo.TimeTracker.SpringBoot.API.Subject;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController()
public class SubjectController {

	@Autowired
	private ISubjectRepository subjectRepository;

	@PostMapping("/subjects")
	public Subject addSubject(@RequestBody Subject subject) {
		subjectRepository.save(subject);
		return subject;
	}

	@PostMapping("/subjects/initialize")
	public void initializeSubjects() {
		ArrayList<Subject> subjects = new ArrayList();

		Subject subject = new Subject();
		//subject.setId(1);
		subject.setDescription("SAP");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocation(Location.onSite);
		subject.setColorCode("colorF39A27");
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(2);
		subject.setDescription("SNP");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocation(Location.home);
		subject.setColorCode("color85E3FF");
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(3);
		subject.setDescription("Support");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocation(Location.onSite);
		subject.setColorCode("color03C03C");
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(4);
		subject.setDescription("Krankmeldung");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocationable(false);
		subject.setSupportsVariableTimeTracking(false);
		subject.setColorCode("color579ABE");
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(5);
		subject.setDescription("Urlaub");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocationable(false);
		subject.setSupportsVariableTimeTracking(false);
		subject.setColorCode("color976ED7");
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(6);
		subject.setDescription("Weiterbildung");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocationable(true);
		subject.setSupportsVariableTimeTracking(true);
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(2);
		subject.setDescription("SNP");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocation(Location.home);
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(3);
		subject.setDescription("Support");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocation(Location.onSite);
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(4);
		subject.setDescription("Krankmeldung");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocationable(false);
		subject.setSupportsVariableTimeTracking(false);
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(5);
		subject.setDescription("Urlaub");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocationable(false);
		subject.setSupportsVariableTimeTracking(false);
		subjects.add(subject);

		subject = new Subject();
		//subject.setId(6);
		subject.setDescription("Weiterbildung");
		subject.setCreatedAt(new Date());
		subject.setChangedAt(new Date());
		subject.setLocationable(true);
		subject.setSupportsVariableTimeTracking(true);
		subjects.add(subject);

		subjectRepository.saveAll(subjects);
	}

	@GetMapping("/subjects")
	public Iterable<Subject> findSubjects() {
		return subjectRepository.findAll();
	}

}
