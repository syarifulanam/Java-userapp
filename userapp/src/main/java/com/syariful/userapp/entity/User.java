package com.syariful.userapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@ToString
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {
    @Id // agar jadi primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremental, fungsinya agar bisa bikin nomor urut otomatis
    private Long id; // nama kolom

    @Column(nullable = false) //kolom "text" ini tidak boleh kosong
    private String text; // nama kolom

    // fungsinya agar ketika data diisi, kita mencatat tanggal data ini dibuat
    @CreationTimestamp // fungsinya agar dia bisa isi tanggal data dibuat secara otomatis
    @Column(name = "created_at", nullable = false, updatable = false) // tidak boleh kosong & tidak boleh diupdate
    private Date createdAt;

    // fungsinya agar ketika data di ubah, kita mencatat tanggal data ini di ubah
    @UpdateTimestamp // fungsinya agar dia bisa isi tanggal data yg diubah secara otomatis
    @Column(name = "update_at")
    private Date updateAt;
}
