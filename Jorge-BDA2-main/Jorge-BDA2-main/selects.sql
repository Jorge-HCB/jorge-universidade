select primeiro_nome, sobrenome, curso, nota from "CANDIDATO" as ca
inner join "MATRICULAS" as m on ca."CPF" = m.cpf
inner join "CURSOS" as c on m.curso_id = c.curso_id
inner join "NOTAS" as n on ca."CPF" = n."CPF"
order by n.nota DESC;