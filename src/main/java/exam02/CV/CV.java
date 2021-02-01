package exam02.CV;

import java.util.ArrayList;
import java.util.List;

    public class CV {
        private String name;
        private int level;
        private final List < IllegalArgumentException > skills = new ArrayList <>();


        public CV(String name) {

            this.name = name;
        }

        public void addSkills(String... skill) {

        }

        public int findSkillLevelByName(String name) {
            int skillLevel = 0;
            for (Skill skill : skills) {
                if (skill.getName().equals(name)) {
                    skillLevel = skill.getLevel();
                }
            }
            return skillLevel;
        }

        public String getName() {
            return name;
        }

        public List < exam02.cv.Skill > getSkills() {
            return skills;
        }
    }
