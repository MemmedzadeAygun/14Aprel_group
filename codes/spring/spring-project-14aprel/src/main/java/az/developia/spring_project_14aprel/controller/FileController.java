package az.developia.spring_project_14aprel.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "/files")
public class FileController {

	@Value(value = "${file.file-dir}")
	private String uploadDir;
	
	@PostMapping(path = "/upload")
	public ResponseEntity<String> upload(@RequestParam MultipartFile file) throws IOException{
		// Qovluğu yarat
        Path folder = Paths.get(uploadDir);
        Files.createDirectories(folder);

        // Orijinal fayl adı java.png
        String originalFileName = file.getOriginalFilename();

        // Faylın uzantısı (.png, .pdf, .jpg ...) .png
        String extension = "";
        if (originalFileName != null && originalFileName.contains(".")) {
            extension = originalFileName.substring(originalFileName.lastIndexOf("."));
        }

        // UUID ilə yeni fayl adı  dsfhdgfhg.png
        String randomFileName = UUID.randomUUID() + extension;

        // Faylı saxla
        Files.copy(
                file.getInputStream(),
                folder.resolve(randomFileName),
                StandardCopyOption.REPLACE_EXISTING
        );
        
        return ResponseEntity.ok("File upload successfully. File name: " + randomFileName);

	}
	
	@GetMapping(path = "/download/{fileName}")
	public ResponseEntity<Resource> download(@PathVariable String fileName) throws IOException {
		 Path filePath = Paths.get(uploadDir).resolve(fileName);

		    Resource resource = new UrlResource(filePath.toUri());

		    if (!resource.exists() || !resource.isReadable()) {
		        return ResponseEntity.notFound().build();
		    }

		    String contentType = Files.probeContentType(filePath);

		    if (contentType == null) {
		        contentType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
		    }

		    return ResponseEntity.ok()
		            .contentType(MediaType.parseMediaType(contentType))
		            .header(HttpHeaders.CONTENT_DISPOSITION,
		                    "attachment; filename=\"" + resource.getFilename() + "\"")
		            .body(resource);

	}
}
