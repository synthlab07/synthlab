package com.synthlab.synthlab_api.Repositories;

import com.synthlab.synthlab_api.Entities.UsuarioAvatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioAvatarRepository extends JpaRepository<UsuarioAvatar, Long> {
}
