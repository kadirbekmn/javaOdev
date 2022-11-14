package kodlama.io.softwareLanguages.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "technologies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Technology {

	@Id
	@Column(name = "technologyId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "software_language_id")
	private SoftwareLanguage softwareLanguage;
}
