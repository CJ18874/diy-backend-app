package com.cjy.diy;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cjy.diy.model.Category;
import com.cjy.diy.model.Media;
import com.cjy.diy.model.Owner;
import com.cjy.diy.model.Project;
import com.cjy.diy.repository.CategoryRepository;
import com.cjy.diy.repository.MediaRepository;
import com.cjy.diy.repository.OwnerRepository;
import com.cjy.diy.repository.ProjectRepository;

@SpringBootApplication
public class DIYMainApp implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(DIYMainApp.class);

	@Value("${spring.profiles.active}")
	private String activeProfile;

	public static void main(String[] args) {
		SpringApplication.run(DIYMainApp.class, args);
	}

	@Autowired
	OwnerRepository ownerRepository;
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	MediaRepository mediaRepository;

	@Override
	public void run(String... args) throws Exception {
		logger.info("activeProfile: " + activeProfile);

		if (activeProfile.equals("dev")) {
			if (ownerRepository.count() == 0) {
				logger.info("Insert owners");
				List<Owner> list = new ArrayList<Owner>();
				for (int i = 0; i < 5; i++) {
					Owner owner = new Owner();
					owner.setName("name_" + (i + 1));
					owner.setEmail("seller_" + (i + 1) + "@seller.com");
					list.add(owner);
				}
				ownerRepository.saveAll(list);
			}

			if (categoryRepository.count() == 0) {
				logger.info("Insert categories");
				Category stringCategory = new Category();
				stringCategory.setId(1);
				stringCategory.setName("string instrument");
				Category windCategory = new Category();
				windCategory.setId(2);
				windCategory.setName("wind instrument");
				Category percussionCategory = new Category();
				percussionCategory.setId(3);
				percussionCategory.setName("percussion instrument");
				Category electronicGearCategory = new Category();
				electronicGearCategory.setId(4);
				electronicGearCategory.setName("electronic gear");

				List<Category> list = new ArrayList<Category>();
				list.add(stringCategory);
				list.add(windCategory);
				list.add(percussionCategory);
				list.add(electronicGearCategory);
				categoryRepository.saveAll(list);
			}

			if (projectRepository.count() == 0) {
				logger.info("Insert projects");
				Project stringProject1 = new Project();
				stringProject1.setTitle("String Project1");
				stringProject1.setDescription("Project Description");
				stringProject1.setInsperation("Project Insperation");
				// stringProject1.KeyWords = null;
				stringProject1.setPublishDate(new Date(1));
				// stringCategory
				Category stringCategory = categoryRepository.findById(1).get();
				stringProject1.setCategory(stringCategory);
				// owner
				Owner name_1 = ownerRepository.findById(4).get();
				stringProject1.setOwner(name_1);

				Project stringProject2 = new Project();
				stringProject2.setTitle("String Project2");
				stringProject2.setDescription(
						"The guitar is a string instrument which is played by plucking the strings. The main parts of a guitar are the body, the fretboard, the headstock and the strings. Guitars are usually made from wood or plastic. Their strings are made of steel or nylon.");
				stringProject2.setInsperation(
						"Think back to the time when your interest in playing guitar was born. Remember the time when you got your first guitar and actually started playing it. For most of us, even when we were totally beginners, clueless about how to play anything, it somehow didn’t matter because we were just so excited about beginning our musical/guitar journey. I can remember the exact day I bought my first guitar (January 31, 1986). I was extremely excited about owning a guitar and banging around on it making all kinds of terrible noises at first.");
				stringProject2.setKeyWord("KeyWord");
				stringProject2.setPublishDate(new Date(0));
				// stringCategory
				stringProject2.setCategory(stringCategory);
				// owner
				stringProject2.setOwner(name_1);

				Project stringProject3 = new Project();
				stringProject3.setTitle("String Project3");
				stringProject3.setDescription("Project Description");
				stringProject3.setInsperation("How To Make A Magnetic Truss Rod Cover");
				stringProject3.setCategory(stringCategory);
				stringProject3.setOwner(name_1);

				Project stringProject4 = new Project();
				stringProject4.setTitle("String Project4");
				stringProject4.setDescription("Project Description");
				stringProject4.setInsperation("Project Insperation");
				stringProject4.setCategory(stringCategory);
				stringProject4.setOwner(name_1);

				Project stringProject5 = new Project();
				stringProject5.setTitle("String Project5");
				stringProject5.setDescription("Project Description");
				stringProject5.setInsperation("Project Insperation");
				stringProject5.setCategory(stringCategory);
				stringProject5.setOwner(name_1);

				Project stringProject6 = new Project();
				stringProject6.setTitle("String Project6");
				stringProject6.setDescription("Project Description");
				stringProject6.setInsperation("Project Insperation");
				stringProject6.setKeyWord("Key");
				stringProject6.setPublishDate(new Date(0));
				stringProject6.setCategory(stringCategory);
				// owner
				Owner name_2 = ownerRepository.findById(5).get();
				stringProject6.setOwner(name_2);

				Project windProject1 = new Project();
				windProject1.setTitle("Wind Project1");
				windProject1.setDescription("Project Description");
				windProject1.setInsperation("Project Insperation");
				windProject1.setKeyWord(null);
				windProject1.setPublishDate(new Date(0));
				// windCategory
				Category windCategory = categoryRepository.findById(2).get();
				windProject1.setCategory(windCategory);
				windProject1.setOwner(name_1);

				Project windProject2 = new Project();
				windProject2.setTitle("Wind Project1");
				windProject2.setDescription("Project Description");
				windProject2.setInsperation("Project Insperation");
				windProject2.setKeyWord(null);
				windProject2.setPublishDate(new Date(0));
				windProject2.setCategory(windCategory);
				windProject2.setOwner(name_1);

				Project windProject3 = new Project();
				windProject3.setTitle("Wind Project3");
				windProject3.setDescription("Project Description");
				windProject3.setInsperation("Project Insperation");
				windProject3.setKeyWord(null);
				windProject3.setPublishDate(new Date(0));
				windProject3.setCategory(windCategory);
				windProject3.setOwner(name_1);

				Project percussionProject1 = new Project();
				percussionProject1.setTitle("Percussion Project1");
				percussionProject1.setDescription("Project Description");
				percussionProject1.setInsperation("Project Insperation");
				percussionProject1.setKeyWord(null);
				// percussionCategory
				Category percussionCategory = categoryRepository.findById(3).get();
				percussionProject1.setCategory(percussionCategory);
				// owner
				Owner name_3 = ownerRepository.findById(6).get();
				percussionProject1.setOwner(name_3);

				Project percussionProject2 = new Project();
				percussionProject2.setTitle("Percussion Project2");
				percussionProject2.setDescription("Project Description");
				percussionProject2.setInsperation("Project Insperation");
				percussionProject2.setKeyWord(null);
				percussionProject2.setPublishDate(new Date(0));
				percussionProject2.setCategory(percussionCategory);
				percussionProject2.setOwner(name_3);

				Project elecProject1 = new Project();
				elecProject1.setTitle("Electronic Project1");
				elecProject1.setDescription("Project Description");
				elecProject1.setInsperation("Project Insperation");
				elecProject1.setKeyWord(null);
				elecProject1.setPublishDate(new Date(0));
				// electronicGearCategory
				Category electronicGearCategory = categoryRepository.findById(4).get();
				elecProject1.setCategory(electronicGearCategory);
				elecProject1.setOwner(name_2);

				List<Project> list = new ArrayList<Project>();
				list.add(stringProject1);
				list.add(stringProject2);
				list.add(stringProject3);
				list.add(stringProject4);
				list.add(stringProject5);
				list.add(stringProject6);
				list.add(windProject1);
				list.add(windProject2);
				list.add(windProject3);
				list.add(percussionProject1);
				list.add(percussionProject2);
				list.add(elecProject1);
				projectRepository.saveAll(list);
			}

			if (mediaRepository.count() == 0) {
				Media stringProjectMedia1 = new Media();
				stringProjectMedia1.setDescription("Project Media description");
				stringProjectMedia1.setUrl("string/1.jpg");
				stringProjectMedia1.setMainMedia(true);
				// project
				Project stringProject1 = projectRepository.findById(3).get();
				stringProjectMedia1.setProject(stringProject1);

				Media stringProjectMedia2 = new Media();
				stringProjectMedia2.setDescription("Project Media description");
				stringProjectMedia2.setUrl("string/10.jpg");
				stringProjectMedia2.setMainMedia(true);
				stringProjectMedia2.setProject(stringProject1);

				Media stringProjectMedia3 = new Media();
				stringProjectMedia3.setDescription("Project Media description");
				stringProjectMedia3.setUrl("string/326.jpg");
				stringProjectMedia3.setMainMedia(true);
				stringProjectMedia3.setProject(stringProject1);

				Media stringProjectMedia4 = new Media();
				stringProjectMedia4.setDescription("Project Media description");
				stringProjectMedia4.setUrl("string/a.png");
				stringProjectMedia4.setMainMedia(true);
				stringProjectMedia4.setProject(stringProject1);

				List<Media> list = new ArrayList<Media>();
				list.add(stringProjectMedia1);
				list.add(stringProjectMedia2);
				list.add(stringProjectMedia3);
				list.add(stringProjectMedia4);
				mediaRepository.saveAll(list);
			}
		}
	}
}
