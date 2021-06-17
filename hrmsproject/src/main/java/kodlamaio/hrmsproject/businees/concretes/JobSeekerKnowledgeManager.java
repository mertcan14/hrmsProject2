package kodlamaio.hrmsproject.businees.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerKnowledgeService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobSeekerKnowledgeDao;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerKnowledge;
@Service
public class JobSeekerKnowledgeManager implements JobSeekerKnowledgeService{

	private JobSeekerKnowledgeDao jobSeekerKnowledgeDao;
	
	public JobSeekerKnowledgeManager(JobSeekerKnowledgeDao jobSeekerKnowledgeDao) {
		super();
		this.jobSeekerKnowledgeDao = jobSeekerKnowledgeDao;
	}
	
	@Override
	public Result add(JobSeekerKnowledge jobSeekerKnowledge) {
		this.jobSeekerKnowledgeDao.save(jobSeekerKnowledge);
		return new SuccessResult("başarı ile eklendi");
	}

}
