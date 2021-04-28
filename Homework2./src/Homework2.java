
		public class Homework2 {

		    public static void main(String[] args) {

		        Feature feature1 = new Feature("Yazılım Geliştirici Kampı(JAVA+REACT)",32);
		        Feature feature2 = new Feature("Yazılım Geliştirici Kampı(C#+Angular)",56);

		        Feature[] features = new Feature[] {feature1,feature2};
		        for(Feature feature : features)
		        {
		            System.out.println(feature.name);
		        }
		        

		    }
		}

		public class YoklamaManager {
		    public void derseGirdi(Feature feature)
		    {
		        System.out.println("Yoklamanız alınmıştır.");
		    }
		    public void odevYapti(Feature feature)
		    {
		        System.out.println("Bitir ve devam et");
		    }
		    public void ekle(Feature feature)
		    {
		        System.out.println("Kurs Eklendi");
		    }
		}

		public class Feature {
		    public Feature(String name,int level){
		        this.level=level;
		        this.name=name;

		    }

		    String name;
		    int level;
		}
	}

}
