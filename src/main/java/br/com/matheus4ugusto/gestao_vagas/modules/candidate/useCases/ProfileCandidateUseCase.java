package br.com.matheus4ugusto.gestao_vagas.modules.candidate.useCases;


import br.com.matheus4ugusto.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.matheus4ugusto.gestao_vagas.modules.candidate.dto.ProfileCandidateResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ProfileCandidateUseCase {

    ArrayList<Integer> numbers;

    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID idCandidate) {
        var candidate = this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> new UsernameNotFoundException("User not found0"));

        var candidateDTO = ProfileCandidateResponseDTO.builder()
                .description(candidate.getDescription())
                .username(candidate.getUsername())
                .email(candidate.getName())
                .name(candidate.getName())
                .id(candidate.getId())
                .build();

        return candidateDTO;

    }

}
