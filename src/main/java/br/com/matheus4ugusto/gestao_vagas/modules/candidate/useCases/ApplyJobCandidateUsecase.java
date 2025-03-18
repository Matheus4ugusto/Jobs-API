package br.com.matheus4ugusto.gestao_vagas.modules.candidate.useCases;

import br.com.matheus4ugusto.gestao_vagas.exceptions.JobNotFoundException;
import br.com.matheus4ugusto.gestao_vagas.exceptions.UserNotFoundException;
import br.com.matheus4ugusto.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.matheus4ugusto.gestao_vagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApplyJobCandidateUsecase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    // ID do candidato
    // ID da vaga
    public void execute(UUID idCandidate, UUID idJob){
        // validar se o candidato existe
        this.candidateRepository.findById(idCandidate).orElseThrow(UserNotFoundException::new);
        // validar se a vaga existe
        this.jobRepository.findById(idJob).orElseThrow(JobNotFoundException::new);
        // candidato se inscrever na vaga


    }

}
