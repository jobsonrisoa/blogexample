package com.spring.blogexample.utils;

import com.spring.blogexample.model.Post;
import com.spring.blogexample.repository.BlogexampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    BlogexampleRepository blogexampleRepository;

    //@PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Jobson Ribeiro");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut lacinia diam in erat maximus, sed porttitor lorem posuere. In sem leo, hendrerit ut sagittis non, lacinia vel sem. Ut vehicula eu elit sit amet rhoncus. Suspendisse eget sapien pharetra, finibus tellus et, ullamcorper neque. Cras eget enim et magna iaculis blandit. In tempor scelerisque urna, sed tincidunt arcu ullamcorper quis. Vestibulum tristique nunc eu laoreet imperdiet. Pellentesque sit amet arcu aliquet libero hendrerit suscipit at ut urna. Quisque mattis nulla vitae urna interdum fermentum quis a massa. Phasellus magna erat, hendrerit pellentesque tellus vel, pretium fringilla nisi. Donec sit amet magna in felis consectetur fringilla.");

        Post post2 = new Post();
        post2.setAutor("Rebeca Oliveira");
        post2.setData(LocalDate.now());
        post2.setTitulo("Git");
        post2.setTexto("Sed vitae egestas diam. Nam iaculis venenatis sagittis. Donec sollicitudin tempus aliquet. Phasellus eros leo, fringilla vel aliquam eu, ullamcorper sit amet odio. Etiam placerat enim eu malesuada laoreet. Maecenas non dolor lectus. Sed a pulvinar lectus. Maecenas nec posuere sapien. Mauris dignissim, felis nec aliquam mattis, lacus nunc iaculis ex, non ultricies tortor nulla ut justo. Pellentesque id nibh at quam porta iaculis a eget eros. Maecenas sed metus felis. Praesent bibendum, neque sit amet venenatis ornare, augue nisi egestas neque, ac viverra turpis lectus eget turpis. Nunc sollicitudin varius lectus, sit amet iaculis ex finibus at. Praesent vitae lectus in magna imperdiet ullamcorper sed ac leo.");

        Post post3 = new Post();
        post3.setAutor("Lucidalva Ferreira");
        post3.setData(LocalDate.now());
        post3.setTitulo("Kubernetes");
        post3.setTexto("Integer quis arcu in sapien dignissim ultrices. Integer vehicula, turpis ut tincidunt euismod, felis massa commodo tellus, nec vehicula lectus elit non enim. Nulla a odio non ante hendrerit elementum. Morbi dui sapien, congue id dapibus viverra, pretium et justo. Nunc metus nunc, imperdiet accumsan malesuada eu, maximus vitae erat. Aliquam porttitor sem vitae congue posuere. Vestibulum vitae sodales arcu. Praesent mattis libero sit amet leo rhoncus, in volutpat turpis pretium. Morbi pretium velit sodales urna volutpat, eu auctor ex fringilla. Nulla at ante at augue sagittis egestas. Morbi ornare enim eget magna venenatis tincidunt. Proin condimentum non sapien eu pharetra. Sed pharetra feugiat vulputate.");

        postList.add(post1);
        postList.add(post2);
        postList.add(post3);

        for(Post post: postList) {
            Post postSaved = blogexampleRepository.save(post);
            System.out.println(postSaved.getId());
        }



    }

}
