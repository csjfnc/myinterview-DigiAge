1: Query que retorna a quantidade de funcionários separados por sexo.

select gender as sexo, 
count(gender) as quantidade 
from employees group by gender 

2: Query que retorna a quantidade de funcionários distintos por sexo, ano e ano de nascimento.

select employees.gender as sexo, 
min(salary) as salario_minimo, 
avg(salary) as salario_medio, 
max(salary) as salario_maximo 

from salaries 
inner join employees using (emp_no) 
group by(employees.gender);

3: Query que retorna a média, min e max de salário por sexo.

select 
gender,
 
year(birth_date) as ano_nascimento, 

count(YEAR(birth_date)) as qtd_funcionarios_ano_nascimento, 

year(hire_date) as ano_contratacao,
 
count(year(hire_date)) as qtd_funcioanarios_ano_contratacao
 
from employees group by ano_nascimento, ano_contratacao, 
gender